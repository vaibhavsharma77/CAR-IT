package com.spring.boot.app.carIT.services.impl;

import com.spring.boot.app.carIT.Dao.itf.UserDAO;
import com.spring.boot.app.carIT.models.User;
import com.spring.boot.app.carIT.services.itf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUsers() {
        return userDAO.fetchUsers();
    }

    @Override
    public User getUserById(int userId) {
        return userDAO.fetchUserById(userId);
    }

    @Override
    public void registerUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void modifyUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userDAO.removeUser(userId);
    }
}
