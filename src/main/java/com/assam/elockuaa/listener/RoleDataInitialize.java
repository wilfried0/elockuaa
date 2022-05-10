package com.assam.elockuaa.listener;

import com.assam.elockuaa.models.ERole;
import com.assam.elockuaa.models.Role;
import com.assam.elockuaa.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class RoleDataInitialize implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        for(ERole eRole: ERole.values()) {
            Role role = new Role(eRole);
            roleRepository.save(role);                
        } 
    }
    
}
