package com.assam.elockuaa.controllers;

import com.assam.elockuaa.exceptions.ResourceNotFoundException;
import com.assam.elockuaa.models.User;
import com.assam.elockuaa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users/{id}")
    ResponseEntity<User> getUserById(@Validated @PathVariable(value = "id") long userId) throws ResourceNotFoundException {
        User user = this.userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("Utilisateur introuvable avec pour id = "+userId));
        return ResponseEntity.ok().body(user);
    }
}
