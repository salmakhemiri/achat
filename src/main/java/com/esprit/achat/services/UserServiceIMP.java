package com.esprit.achat.services;

import com.esprit.achat.persistence.entity.Role;
import com.esprit.achat.persistence.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMP extends GenericServiceIMP<User,Integer> implements UserService{
}
