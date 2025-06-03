package com.leasantosbr.auth.infrastructure.persistence.repositories;

import java.util.Optional;
import java.util.UUID;

import com.leasantosbr.auth.domain.entities.User;
import com.leasantosbr.auth.domain.repositories.UserRepository;

public class UserRepositoryImpl implements UserRepository{

	private final UserJpaRepository userJpaRepository;

	public UserRepositoryImpl(UserJpaRepository userJpaRepository) {
		this.userJpaRepository = userJpaRepository;
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return userJpaRepository.findByEmail(email);
	}

	@Override
	public User save(User user) {
		return userJpaRepository.save(user);
		
	}

	@Override
	public boolean existsByEmail(String email) {
		return userJpaRepository.existsByEmail(email);
	}

	@Override
	public Optional<User> findById(UUID id) {
		return userJpaRepository.findById(id);
	}
}
