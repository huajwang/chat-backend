package com.longmaple.edu.rest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.longmaple.edu.data.Article;
import com.longmaple.edu.data.ArticleRepo;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	private ArticleRepo articleRepo;
	
	@RequestMapping
	@ResponseBody
	public String doTest() {
		String s = "<div><p>This is a test</p></div>";
		byte[] a = s.getBytes();
		Article article = new Article();
		article.setTitle("first try");
		article.setAuthor("长风万里");
		article.setCreateTime(new Date());
		article.setContent(a);
		article.setTxt("<div><p>This is another test</p></div>");
		articleRepo.save(article);
		System.out.println(a);
		return "aaa";
	}
	
	@RequestMapping("/getone")
	@ResponseBody
	public Article getArticle() {
		Optional<Article> a = articleRepo.findById(9);
		System.out.println(new String(a.get().getContent()));
		System.out.println(a.get().getTxt());
		return a.get();
	}
	
	@RequestMapping("/articles")
	@ResponseBody
	public List<Article> getArticles() {
		List<Article> articles = articleRepo.findAll();
		System.out.println(articles.get(0).getCreateTime());
		return articles;
	}
}
