package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smart.dto.UserDto;
import com.smart.helper.Message;
import com.smart.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home - SCM");
		return "home";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About - SCM");
		return "about";
	}
	
	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Register - SCM");
		model.addAttribute("user", new UserDto());
		return "signup";
	}
	
	@PostMapping("/do_register/save")
	public String do_register(@Valid @ModelAttribute("user") UserDto userDto, BindingResult bindingResult,
			@RequestParam(value = "agreement", defaultValue = "false") boolean agreement,
			Model model, HttpSession session) {
		System.out.println("UserDto : " + userDto);
		try {
			System.out.println(userDto);
			if(!agreement) {
				System.out.println("You have not agreed the Terms & Conditions.");
				throw new Exception("You have not agreed the Terms & Conditions.");
			}
			
			if(bindingResult.hasErrors()) {
				System.out.println(bindingResult);
				return "signup";
			}
			
//			user.setRole("ROLE_USER");
			userDto.setEnabled(true);
			userDto.setImageUrl("default.png");
			
			System.out.println("Agreement : " + agreement);
			System.out.println("User : " + userDto);
			
//			user.setPassword(passwordEncoder.encode(user.getPassword()));
			
//			User result = userRepository.save(userDto);
			
//			System.out.println(result);
			userService.saveUser(userDto);
			
			
			model.addAttribute("user", new UserDto());
			session.setAttribute("message", new Message("Register Successfully!", "alert-success"));
		
		} catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("user", userDto);
			session.setAttribute("message", new Message("Something Went Wrong : "+e.getMessage(), "alert-danger"));
		return "signup";
		}
		return "signup";	
	}
	
	@GetMapping("users/login")
	public String login() {
		return "login";
	}
	
}
