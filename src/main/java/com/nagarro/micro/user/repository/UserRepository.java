package com.nagarro.micro.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.micro.user.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
