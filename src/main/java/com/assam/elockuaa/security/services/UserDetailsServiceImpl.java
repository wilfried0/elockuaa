package com.assam.elockuaa.security.services;

import com.assam.elockuaa.models.User;
import com.assam.elockuaa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByPhoneOrEmail(username, username)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with phone or email: "+username));
		
		return UserDetailsImpl.build(user);
	}

}
