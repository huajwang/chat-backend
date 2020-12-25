package com.longmaple.edu.rest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder.Redirect;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/python")
public class PythonController {

	@RequestMapping
	@ResponseBody
	public List<String> doTest() throws InterruptedException {
		List<String> results = new ArrayList<>();
		try {
			// ProcessBuilder processBuilder = new ProcessBuilder("python", resolvePythonScriptPath("hello.py"));
			String s = readFile();
			ProcessBuilder processBuilder = new ProcessBuilder("python", "-c", s);
			processBuilder.redirectErrorStream(true);

			Process process = processBuilder.start();

			InputStream inputStream = process.getInputStream();
			results = readOutput(inputStream);
			int exitCode = process.waitFor();


			System.out.println(exitCode);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return results;
	}

	private List<String> readOutput(InputStream inputStream) throws IOException {
		try (BufferedReader output = new BufferedReader(new InputStreamReader(inputStream))) {
			return output.lines()
					.collect(Collectors.toList());
		}
	}

	private String resolvePythonScriptPath(String filename) {
		File file = new File("src/main/resources/" + filename);
		System.out.println(file.getAbsolutePath());
		return file.getAbsolutePath();
	}

	private String readFile() {
		// File file = new File("src/main/resources/hello.py");
		List<String> lines = new ArrayList<>();
		try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get("src/main/resources/hello.py"), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	  
	      // do something 
	      e.printStackTrace(); 
	    } 
		System.out.println(lines.toString());
		return lines.toString();
	}

}
