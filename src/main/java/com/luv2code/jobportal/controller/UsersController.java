package com.luv2code.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.luv2code.jobportal.entity.Users;
import com.luv2code.jobportal.entity.UsersType;
import com.luv2code.jobportal.repository.UsersTypeRepository;
import com.luv2code.jobportal.services.*;

@Controller
public class UsersController {
	
	private final UsersTypeService UsersTypeService;

	@Autowired
	public UsersController(UsersTypeService usersTypeService) {
		this.UsersTypeService = usersTypeService;
	}
	
	@GetMapping("/register")
	public String register(Model model)
	{
		List<UsersType> usersType = UsersTypeService.getAll();
		model.addAttribute("getAllTypes",usersType);
		model.addAttribute("user",new Users());
		return "register";
	}
	

}
