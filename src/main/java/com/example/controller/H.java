package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class H {
	@RequestMapping(value="/hh")
	public String home(){
		System.out.println("redirect to home page!");
		return "index";
	}
}
