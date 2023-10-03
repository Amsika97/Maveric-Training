package com.training.org.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.org.model.UserRecord;
import com.training.org.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;  
@Service    
public class UserService   
{    
	@Autowired    
	private UserRepository userRepository;    
	public List<UserRecord> getAllUsers()  
	{    
		List<UserRecord>userRecords = new ArrayList<>();    
		userRepository.findAll().forEach(userRecords::add);    
		return userRecords;    
	}    
	public void addUser(UserRecord userRecord)  
	{    
		userRepository.save(userRecord);    
	}    
	public void deleteUser(String id)
	{
		userRepository.deleteById(id);
	}

	public void updateUser(String userId, UserRecord updatedUser) {

        userRepository.save(updatedUser);

        

    } 
 

}    