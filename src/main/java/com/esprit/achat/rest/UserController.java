package com.esprit.achat.rest;

import com.esprit.achat.persistence.entity.Role;
import com.esprit.achat.persistence.entity.User;
import com.esprit.achat.services.RoleService;
import com.esprit.achat.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("user")
@AllArgsConstructor
public class UserController {
    private UserService userService;
    @GetMapping
    List<User> retrieveAll(){

        return userService.retrieveAll();
    }
    @PostMapping("/add")
    void add(User u){

        userService.add(u);
    }
    @PutMapping("/edit")
    void update(User u){

        userService.update(u);
    }
    @DeleteMapping("/delete/{idUser}")
    void remove(Integer id){

        userService.remove(id);
    }
    @GetMapping("/{idUser}")
    User retrieve(Integer id){

        return userService.retrieve(id);
    }
}
