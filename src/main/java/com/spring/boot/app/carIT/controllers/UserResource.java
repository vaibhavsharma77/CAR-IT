package com.spring.boot.app.carIT.controllers;

import com.spring.boot.app.carIT.models.User;
import com.spring.boot.app.carIT.services.itf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/customers")
    public List<User> getAllCustomers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/customers/{id}")
    public User getCustomerById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @PostMapping(value = "/customer/persist")
    public void saveCustomer(@RequestBody User user) {
        userService.registerUser(user);
    }
}