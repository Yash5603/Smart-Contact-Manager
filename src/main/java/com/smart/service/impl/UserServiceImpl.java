package com.smart.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.smart.dao.RoleRepository;
import com.smart.dao.UserRepository;
import com.smart.dto.UserDto;
import com.smart.entities.Role;
import com.smart.entities.User;
import com.smart.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private PasswordEncoder passwordEncoder;
	
	public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Override
	public void saveUser(UserDto userDto) {
		
		User user = new User();
		
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());;
		user.setImageUrl("default.png");
		//encrypt the password using spring security
		user.setPassword(passwordEncoder.encode(userDto.getPassword()));
		
		Role role = roleRepository.findByName("ROLE_USER");
		if(role==null) {
			role = checkRoleExist();
		}
		user.setRoles(Arrays.asList(role));
		userRepository.save(user);
	}

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public List<UserDto> findAllUsers() {
		List<User> users = userRepository.findAll();
		return users.stream().map((user) -> mapToUserDto(user)).collect(Collectors.toList());
	}
	
	private UserDto mapToUserDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setName(user.getName());
		userDto.setName(user.getEmail());
		userDto.setName(user.getAbout());
		userDto.setName(user.getImageUrl());
		return userDto;
	}
	
	private Role checkRoleExist() {
		Role role = new Role();
		role.setName("ROLE_USER");
		return roleRepository.save(role);
	}

}
