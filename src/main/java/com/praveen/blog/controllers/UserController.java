package com.praveen.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praveen.blog.payloads.UserDto;
import com.praveen.blog.services.UserService;

// for telling spring that this is controller
@RestController
// initial mapping url applicable for all url present in this controller
@RequestMapping("/api/users")
public class UserController {
	//Post - create user
	//PUT - update user
	//DELETE - delete user
	//GET - user get
	
	@Autowired
	private UserService userService;
	
	//Post - create user
	@GetMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		UserDto createUserDto = this.userService.createUser(userDto);
		return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
	}
	

}
