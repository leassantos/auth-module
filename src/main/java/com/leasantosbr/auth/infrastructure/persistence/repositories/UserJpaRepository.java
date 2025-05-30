package com.leasantosbr.auth.infrastructure.persistence.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leasantosbr.auth.infrastructure.persistence.entities.UserEntity;

public interface UserJpaRepository extends JpaRepository<UserEntity, UUID>{

	Optional<UserEntity> findByEmail(String email);
	boolean existsByEmail(String email);
}
