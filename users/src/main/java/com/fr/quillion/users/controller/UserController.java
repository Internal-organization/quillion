package com.fr.quillion.users.controller;

import com.fr.quillion.users.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Les Choupinets on 01/12/2016.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/admin/users")
    public String toUsers(){ return "users"; }

    @GetMapping("/api/users/")
    public String getUsers(){
        return "test";
    }
}
