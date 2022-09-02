package com.capgemini.entity.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {


}
