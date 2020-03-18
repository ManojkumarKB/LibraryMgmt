package com.library.pract.controller;

import java.util.List;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.library.pract.Repository.BookRepository;
import com.library.pract.model.Book;

@RestController
public class HelloController {
	
	@Autowired
	BookRepository bookRepository;
	
	
	/*@GetMapping("/")
	public ModelAndView hello()
	{
		
		ModelAndView mav = new ModelAndView("BookEntry");
		return mav;
	}*/
	
	
	@GetMapping("/Allbooks")
	public List<Book> allBook()
	{
		return bookRepository.findAll();
	}
	
	
	@PostMapping("/saveBooks")
	public String saveBook(@RequestBody Book book)
	{
		bookRepository.save(book);
		System.out.println("savebooks");
		return "Books saved";
	}
	
	@GetMapping("/Category")
	public Object category()
	{
		System.out.println("Category");
		try
		{
			FileReader reader = new FileReader("Category_Section.json");
			JSONParser jsonParser = new JSONParser();
			  try 
			  {
				Object obj = jsonParser.parse(reader);
				return obj;
			  }
			  catch (IOException e)
			  {
				e.printStackTrace();
			  } 
			  catch (ParseException e) 
			  {
				e.printStackTrace();
			  }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
