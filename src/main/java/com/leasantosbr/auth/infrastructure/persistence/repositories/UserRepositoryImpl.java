package com.leasantosbr.auth.infrastructure.persistence.repositories;

import java.util.Optional;
import java.util.UUID;

import com.leasantosbr.auth.domain.entities.User;
import com.leasantosbr.auth.domain.repositories.UserRepository;
import com.leasantosbr.auth.infrastructure.persistence.mappers.UserEntityMapper;

public class UserRepositoryImpl implements UserRepository{

	private final UserJpaRepository userJpaRepository;

	public UserRepositoryImpl(UserJpaRepository userJpaRepository) {
		this.userJpaRepository = userJpaRepository;
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return userJpaRepository.findByEmail(email)
				.map(UserEntityMapper::toDomain);
	}

	@Override
	public void save(User user) {
		userJpaRepository.save(UserEntityMapper.toEntity(user));
		
	}

	@Override
	public boolean existsByEmail(String email) {
		return userJpaRepository.existsByEmail(email);
	}

	@Override
	public Optional<User> findById(UUID id) {
		return userJpaRepository.findById(id)
				.map(UserEntityMapper::toDomain);
	}
}
