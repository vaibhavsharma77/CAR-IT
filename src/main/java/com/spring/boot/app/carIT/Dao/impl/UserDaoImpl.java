package com.spring.boot.app.carIT.Dao.impl;

import com.spring.boot.app.carIT.Dao.itf.UserDAO;
import com.spring.boot.app.carIT.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class UserDaoImpl implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> fetchUsers() {
        String hql = "from User";
        return entityManager.createQuery(hql).getResultList();
    }

    @Override
    public User fetchUserById(int userid) {
        return entityManager.find(User.class, userid);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        User users = fetchUserById(user.getUserId());
        users.setUserName(user.getUserName());
        users.setCarNumber(user.getCarNumber());
        entityManager.flush();
    }

    @Override
    public void removeUser(int userId) {
        entityManager.remove(fetchUserById(userId));
    }
}
