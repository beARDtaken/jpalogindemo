package com.leader.demo.service;

import com.leader.demo.dao.User1Dao;
import com.leader.demo.entity.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User1ServiceImpl {
    @Autowired
    User1Dao user1Dao;
    public List<User1> findall(){
        return user1Dao.findAllBy();
    }
    public List<User1> finduniversity(String university){ return  user1Dao.findByUniversity(university);}
}
