package com.training.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.org.model.UserRecord;
import com.training.org.service.UserService;    
@RestController    
public class UserController   
{    
	@Autowired    
	private UserService userService;     
	@RequestMapping("/")    
	public List<UserRecord> getAllUser()  
	{    
		return userService.getAllUsers();    
	}       
	@RequestMapping(value="/add-user", method=RequestMethod.POST)    
	public void addUser(@RequestBody UserRecord userRecord)  
	{    
		userService.addUser(userRecord);    
	}  
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)

    public void deleteUser(@PathVariable String id) {

        userService.deleteUser(id);

    } 
	
	  @RequestMapping(value = "/update-user/{userId}", method = RequestMethod.PUT)

	    public void updateUser(@PathVariable String userId, @RequestBody UserRecord updatedUser) {

	        userService.updateUser(userId, updatedUser);

	    }
	
	
}    


