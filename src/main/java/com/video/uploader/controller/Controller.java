package com.video.uploader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.video.uploader.entity.User;
import com.video.uploader.service.UserService;

@RestController
@Component
@CrossOrigin
public class Controller {
	
	@Autowired
	private UserService userService;
	
	
	public Controller() {
	}

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("title", "home");
		return mv;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {

		ModelAndView mv = new ModelAndView("user");
		mv.addObject("title", "User");
		return mv;
	}

	@RequestMapping(value = "/forgetpass", method = RequestMethod.GET)
	public ModelAndView forgetpass() {
		ModelAndView mv = new ModelAndView("forgetpass");
		mv.addObject("title", "Forget Password");
		return mv;
	}

	@RequestMapping(value = "/registerpage", method = RequestMethod.GET)
	public ModelAndView registerpage(@ModelAttribute User user, BindingResult result, @RequestParam String action) {
		ModelAndView mv = new ModelAndView("registerpage");
		mv.addObject("title", "RegisterPage");
		return mv;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(@ModelAttribute User user, BindingResult result, @RequestParam String action) {
		ModelAndView mv = new ModelAndView("register");
		userService.createUser(user);
		
		mv.addObject("message", "User Registered");
		mv.addObject("title", "Register");
		return mv;
	}
	
}
