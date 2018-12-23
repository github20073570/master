package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;


@RestController
public class HomeController {
 
	@RequestMapping(value="/home")
	@ResponseBody
	public ModelAndView home(){
		ModelAndView mode = new ModelAndView();
		mode.addObject("name", "zhangsan");
		mode.setViewName("main/hell");
		return mode;
	}
	
	
	@RequestMapping(value="/home/page")
	@ResponseBody
	public ModelAndView goHome(HttpServletRequest request){
		System.out.println("go to the home page!");
		ModelAndView mode = new ModelAndView();
		mode.addObject("name", "zhangsan");
		mode.setViewName("main/main");
		return mode;
	}
}
