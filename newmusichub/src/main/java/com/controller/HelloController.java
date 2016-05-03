package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	@RequestMapping("/")
	public ModelAndView helloUser1()
	{
		ModelAndView m=new ModelAndView("index");
	//	m.addObject("welcomemessage","Hi user");
		return m;
	}
	@RequestMapping("/register")
	public ModelAndView helloUser2()
	{
		ModelAndView m=new ModelAndView("register");
		//m.addObject("welcomemessage","Hi user");
		return m;
	}
	@RequestMapping("/signin")
	public ModelAndView helloUser3()
	{
		ModelAndView m=new ModelAndView("signin");
		//m.addObject("welcomemessage","Hi user");
		return m;
	}
}
