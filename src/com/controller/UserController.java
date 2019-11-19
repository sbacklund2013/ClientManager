package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.business.UserBusinessInterface;
import com.model.Admin;

@Controller
@RequestMapping("/admin")
public class UserController 
{
	UserBusinessInterface userService;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView showLoginForm()
	{
		return new ModelAndView("Login", "admin", new Admin());
	}
	
	@RequestMapping(path = "/authenticate", method = RequestMethod.POST)
	public ModelAndView authenticate(@ModelAttribute("admin")Admin admin)
	{
		Admin user = userService.authenticate(admin);
		
		if (user != null)
		{
			return new ModelAndView("Main", "admin", user);
		}
		else
		{
			return new ModelAndView("Login", "admin", admin);
		}
	}
	
	@Autowired
	public void setUserService(UserBusinessInterface userService)
	{
		this.userService = userService;
	}
}
