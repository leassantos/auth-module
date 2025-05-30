package com.leasantosbr.auth.infrastructure.persistence.mappers;

import com.leasantosbr.auth.domain.entities.User;
import com.leasantosbr.auth.infrastructure.persistence.entities.UserEntity;

public class UserEntityMapper {

	public static UserEntity toEntity(User user){
		return new UserEntity(
				user.getId(),
				user.getName(),
				user.getEmail(),
				user.getPassword()
		);
	}
	
	public static User toDomain(UserEntity entity){
		return new User(
				entity.getName(),
				entity.getEmail(),
				entity.getPassword()
		);
	}
}
