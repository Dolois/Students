package com.fr.formation.services;

import com.fr.formation.dtos.UserCreateDto;
import com.fr.formation.dtos.UserDeleteDto;
import com.fr.formation.dtos.UserGetIdDto;
import com.fr.formation.dtos.UserUpdateDto;
import com.fr.formation.entities.User;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserJpaRepository repo;

    public UserServiceImpl(UserJpaRepository repo) {
        this.repo = repo;
    }

    // private final UserCustomJpaRepository; convention
    @Override
    public void create(UserCreateDto dto) {
        User user = new User();
        user.setFirstname(dto.getFirstname());
        user.setLastname(dto.getLastname());
        user.setBirthdate(dto.getBirthdate());
        user.setActive(dto.isActive());
        repo.save(user);
    }

	@Override
	public void getUserId(@Valid UserGetIdDto user, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(@Valid UserUpdateDto user, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(@Valid UserDeleteDto user, Long id) {
		// TODO Auto-generated method stub
		
	}
}