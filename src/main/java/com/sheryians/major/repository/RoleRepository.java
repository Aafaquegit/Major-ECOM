package com.sheryians.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import com.sheryians.major.model.Role;



public interface RoleRepository extends JpaRepository<Role,Integer>{
	 
}
