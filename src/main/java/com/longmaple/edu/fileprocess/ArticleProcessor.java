package com.longmaple.edu.fileprocess;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.longmaple.edu.data.Article;
import com.longmaple.edu.data.ArticleRepo;

@Controller
@RequestMapping("/read")
public class ArticleProcessor {
	
	@Autowired
	private ArticleRepo articleRepo;
	
	@RequestMapping
	public String readhtml() throws IOException {
		File file = new File("C:\\Users\\yc_wh\\Desktop\\test.html"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  
		  ByteArrayOutputStream output = new ByteArrayOutputStream();
		  
		  while ((st = br.readLine()) != null) {
			  output.write(st.getBytes());
		  }
		  
		  byte[] out = output.toByteArray();
		  Article article = new Article();
		  article.setTitle("Today is Friday");
		  article.setAuthor("Tom Cotton");
		  article.setCreateTime(new Date());
		  article.setContent(out);
		  article.setTxt("This is a plain text");
		  articleRepo.save(article);
		  br.close();
		return new String(out); 
	} 
}
