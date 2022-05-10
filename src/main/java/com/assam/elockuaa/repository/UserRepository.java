package com.assam.elockuaa.repository;

import java.util.Optional;

import com.assam.elockuaa.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByPhone(String username);
	
	Optional<User> findByEmail(String email);
	
	Optional<User> findByFirstname(String firstname);
	
	Optional<User> findByLastname(String lastname);
	
	Boolean existsByPhone(String username);
	
	Boolean existsByEmail(String email);
	
	Optional<User> findByPhoneOrEmail(String username, String email);
}
