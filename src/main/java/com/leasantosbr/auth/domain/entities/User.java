package com.leasantosbr.auth.domain.entities;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Domain entity represents a user in the system.
 * This class is not coupled with any persistence framework.
*/
public class User {

	private UUID id;
	private String name;
	private String email;
	private String password;
	private boolean active;
	private LocalDateTime createdAt;
	
	public User(UUID id, String name, String email, String password, boolean active, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.active = active;
		this.createdAt = createdAt;
	}
	
	public User(String name, String email, String password) {
		this(UUID.randomUUID(),name, email, password, true, LocalDateTime.now());
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public boolean isActive() {
		return active;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
}
