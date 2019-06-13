package com.leader.demo.dao;

import com.leader.demo.entity.User;
import com.leader.demo.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface User1Dao extends JpaRepository<User1,Integer> {
    public List<User1> findAllBy();
    public List<User1> findByUniversity(String university);
}
