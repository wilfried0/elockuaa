package com.assam.elockuaa.listener;

import com.assam.elockuaa.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class RoleDataRemove implements ApplicationListener<ContextClosedEvent> {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        roleRepository.deleteAll();
    }
}
