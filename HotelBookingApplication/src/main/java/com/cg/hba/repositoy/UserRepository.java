package com.cg.hba.repositoy;

import org.springframework.data.repository.CrudRepository;

import com.cg.hba.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {


}
