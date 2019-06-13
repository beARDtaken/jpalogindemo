package com.leader.demo.dao;

import com.leader.demo.entity.Activity;
import com.leader.demo.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityDao extends JpaRepository<Activity,Object> {
    public Activity getByCreater(int number);
    public List<Activity> findAllBy();
    public List<Activity> findAllByCreater(int creater);
}
