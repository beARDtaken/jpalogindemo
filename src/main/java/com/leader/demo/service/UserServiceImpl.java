package com.leader.demo.service;

import com.leader.demo.dao.UserDao;
import com.leader.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    UserDao userDao;

    public User getUser(String username, String password) {
        return userDao.getByPasswordAndUsername(username,password);
    }

    public void insertUser(User user) {
        userDao.save(user);
    }
    public int update(String password,  String username){
        return userDao.updateStatusById(password,username);
    }
}
