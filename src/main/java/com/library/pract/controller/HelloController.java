package com.library.pract.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.pract.Repository.BookRepository;
import com.library.pract.model.Book;

@RestController
public class HelloController {
	
	@Autowired
	BookRepository bookRepository;
	
	@RequestMapping("/")
	public String hello()
	{
		return "welcome";
	}
	
	@GetMapping("/Allbooks")
	public List<Book> allBook()
	{
		return bookRepository.findAll();
	}
	

}
