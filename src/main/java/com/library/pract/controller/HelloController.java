package com.library.pract.controller;

import java.util.List;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.pract.Repository.BookRepository;
import com.library.pract.Repository.MemberRepository;
import com.library.pract.model.Book;
import com.library.pract.model.Member;

@RestController
public class HelloController {
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	MemberRepository mbRepository;
	
	
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
	
	@PostMapping(path="/saveMembers")
	public String saveMembers(@RequestBody Member mb)
	{
		mbRepository.save(mb);
		return "saved";
	}
	
	
	@GetMapping("/AllMembers")
	public List<Member> allMembers()
	{
		return mbRepository.findAll();
	}
	
	@PostMapping(path="/saveBooks", consumes = "application/json")
	public String saveBook(@RequestBody Book book)
	{
		System.out.println("book"+book);
		try
		{
			bookRepository.save(book);
		}
		catch(DataIntegrityViolationException e)
		{
			System.out.println(book);
			
		}
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
