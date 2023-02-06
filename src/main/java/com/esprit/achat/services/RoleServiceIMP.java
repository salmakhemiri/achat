package com.esprit.achat.services;

import com.esprit.achat.persistence.entity.Role;
import com.esprit.achat.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceIMP extends GenericServiceIMP<Role,Integer> implements RoleService{
    @Autowired
    RoleRepository roleRepository;
}
