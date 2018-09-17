package com.spring.boot.app.carIT.controllers;

import com.spring.boot.app.carIT.models.User;
import com.spring.boot.app.carIT.services.itf.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("carIt")
public class UserResource {
    @Autowired
    private UserService userService;
   @ApiOperation(value = "This API fetches all the available records for all Customer")
    @GetMapping(value = "/customers")
    public List<User> getAllCustomers() {
        return userService.getAllUsers();
    }
    @ApiOperation(value = "This API fetches record for a Customer based on their UserID ")
    @GetMapping(value = "/customer/{id}")
    public User getCustomerById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }
    @ApiOperation(value = "This API persist record of a newly added Customer")
    @PostMapping(value = "/customer/persist")
    public void saveCustomer(@RequestBody User user) {
        userService.registerUser(user);
    }
    @ApiOperation(value = "This API update the Customer record")
    @PutMapping("/customer/update")
    public void updateCustomer(@RequestBody User user) {
        userService.modifyUser(user);
    }
    @ApiOperation(value = "This API delete available data of a  Customer from carIT")
    @DeleteMapping("/customer/remove/{userId}")
    public void removeCustomer(@PathVariable("userId") int userId) {
        userService.deleteUser(userId);
    }
}
