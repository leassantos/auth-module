package com.leasantosbr.auth.infrastructure.persistence.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leasantosbr.auth.domain.entities.User;

public interface UserJpaRepository extends JpaRepository<User, UUID>{

	Optional<User> findByEmail(String email);
	boolean existsByEmail(String email);
}
