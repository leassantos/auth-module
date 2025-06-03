package com.leasantosbr.auth.application.user;

import com.leasantosbr.auth.domain.entities.User;
import com.leasantosbr.auth.domain.repositories.UserRepository;

public class UserRegisterUseCase {

	private final UserRepository userRepository;

	public UserRegisterUseCase(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User execute(String name, String email, String password) {
		User user = new User(name, email, password);
		return userRepository.save(user);
	}
}
