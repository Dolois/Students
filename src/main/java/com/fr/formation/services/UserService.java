package com.fr.formation.services;

import javax.validation.Valid;

import com.fr.formation.dtos.UserCreateDto;
import com.fr.formation.dtos.UserDeleteDto;
import com.fr.formation.dtos.UserGetIdDto;
import com.fr.formation.dtos.UserUpdateDto;

public interface UserService 
{
    void create(UserCreateDto user);
    
    void getUserId(UserGetIdDto user, Long id);

	void update(@Valid UserUpdateDto user, Long id);
	
	void delete(@Valid UserDeleteDto user, Long id);
}