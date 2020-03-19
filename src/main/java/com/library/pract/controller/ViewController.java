package com.library.pract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.library.pract.Repository.BookRepository;
import com.library.pract.model.Book;

@Controller
public class ViewController {
	
	@Autowired
	BookRepository bookRepository;
	
	@RequestMapping("/bk")
	public String bk()
	{
		System.out.println("Dffd");
		return "BookEntry";
	}
	
	/*@PostMapping(path="/saveBoks")
	public String saveBook(@RequestBody Book book)
	{
		System.out.println("book"+book);
		
		bookRepository.save(book);
		System.out.println("savebooks");
		return "Books saved";
	}*/

}
