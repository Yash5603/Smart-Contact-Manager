package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	Role findByName(String name);
}
