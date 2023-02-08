package com.esprit.achat.services.Implementation;

import com.esprit.achat.persistence.entity.Role;
import com.esprit.achat.persistence.entity.User;
import com.esprit.achat.repositories.RoleRepository;
import com.esprit.achat.repositories.UserRepository;
import com.esprit.achat.services.Interface.RoleService;
import com.esprit.achat.services.Interface.UserService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service

public class UserServiceIMP extends GenericServiceIMP<User,Integer> implements UserService {
    @Autowired
    UserRepository userRepository;
}
