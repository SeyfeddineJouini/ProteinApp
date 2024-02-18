package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.IuserService;

import com.entities.User;

@RestController
@RequestMapping("/protein")
public class UserController {
	@Autowired
	IuserService userv;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> pro = userv.findAllUsers();

        return pro;
	    
	}

	@PostMapping("/addusert")
	public User createUser(@Valid @RequestBody User user) {
	    return userv.saveUser(user);
	}

}
