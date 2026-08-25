package com.smart.service;

import java.util.List;

import com.smart.dto.UserDto;
import com.smart.entities.User;

public interface UserService {
	
	void saveUser(UserDto userDto);
	User findUserByEmail(String email);
	List<UserDto> findAllUsers();
}
