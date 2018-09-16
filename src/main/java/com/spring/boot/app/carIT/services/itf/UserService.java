package com.spring.boot.app.carIT.services.itf;

import com.spring.boot.app.carIT.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int userId);

    void registerUser(User user);

    void modifyUser(User user);

    void deleteUser(int userId);
}
