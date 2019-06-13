package com.leader.demo.dao;

import com.leader.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    public User getByPasswordAndUsername(String username, String password);
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update user u set u.password =?1 where u.username = ?2",nativeQuery = true)
    int updateStatusById( String password,  String username);
}