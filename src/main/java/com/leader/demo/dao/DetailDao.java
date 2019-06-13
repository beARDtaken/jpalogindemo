package com.leader.demo.dao;

import com.leader.demo.entity.Detail;
import com.leader.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DetailDao extends JpaRepository<Detail,Object>{
    public Detail getByNumberAndPassword(String number, String password);
    public Detail getByNumber(String number);
    public List<Detail> findAllBy();
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update detail u set u.full_name=?1,u.student_ID=?2,u.email=?3 ,u.school=?4 where u.number = ?5",nativeQuery = true)
    int updateDetail(String full_name,String student_ID,String email,String school,String username);
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update detail u set u.password =?1where u.number = ?2",nativeQuery = true)
    int updatePassword(String password,String number);
}
