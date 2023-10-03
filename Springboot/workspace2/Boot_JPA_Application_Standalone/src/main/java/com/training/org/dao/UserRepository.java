package com.training.org.dao;

import org.springframework.data.repository.CrudRepository;

import com.training.org.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>
{

}
