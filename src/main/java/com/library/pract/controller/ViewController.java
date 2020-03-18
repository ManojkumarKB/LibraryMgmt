package com.library.pract.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {
	
	@RequestMapping("/bk")
	public String bk()
	{
		System.out.println("Dffd");
		return "BookEntry";
	}

}
