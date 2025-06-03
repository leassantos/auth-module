package com.leasantosbr.auth.domain.repositories;

import java.util.Optional;
import java.util.UUID;

import com.leasantosbr.auth.domain.entities.User;

/**
 * Repository interface that defines the operations for user persistence.
 * This abstraction allows us to desacouple the domain layer from infrastructure details.
*/
public interface UserRepository {

	/**
	 * Finds user by email
	 * 
	 * @param email the email to search
	 * @return an Optional containing the User if found, or empty otherwise
	*/
	Optional<User> findByEmail(String email);
	
	/**
	 * Saves or updates a user in the data source
	 * 
	 * @param user the user to save
	*/
	User save(User user);
	
	/**
	 * Checks if a user exists by email
	 * 
	 * @param email the email to check
	 * @return true if a user with that email exists, false otherwise
	*/
	boolean existsByEmail(String email);
	
	/**
	 * Finds user by id
	 * 
	 * @param id the UUID of the user
	 * @return an Optional containing the User if found, or empty otherwise
	*/
	Optional<User> findById(UUID id);
}
