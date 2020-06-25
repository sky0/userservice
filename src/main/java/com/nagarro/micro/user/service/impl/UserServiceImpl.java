package com.nagarro.micro.user.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.micro.user.exception.UserNotFoundException;
import com.nagarro.micro.user.model.User;
import com.nagarro.micro.user.repository.UserRepository;
import com.nagarro.micro.user.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{
	
	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


	@Autowired
	UserRepository userRepo;
	@Override
	public User getUserById(Long id) {
		logger.info("Find user by id:"+id);
		return userRepo.findById(id).orElseThrow(()->new UserNotFoundException(id,"User not found by id:"));
	
	}

}
