package com.fr.formation.services;

import com.fr.formation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository implicite
public interface UserJpaRepository extends JpaRepository<User,Long> {
}