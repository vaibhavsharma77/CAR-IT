package com.spring.boot.app.carIT.Dao.itf;

import com.spring.boot.app.carIT.models.User;

import java.util.List;

public interface UserDAO {
    List<User> fetchUsers();

    User fetchUserById(int userid);

    void addUser(User user);

    void updateUser(User user);

    void removeUser(int userId);
}
