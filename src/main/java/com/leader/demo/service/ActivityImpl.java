package com.leader.demo.service;

import com.leader.demo.dao.ActivityDao;
import com.leader.demo.entity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityImpl {
    @Autowired
    ActivityDao activityDao;
    public List<Activity> findAll(){
        return activityDao.findAll();
    }
    public List<Activity> findAllByCreater(int creater){
        return  activityDao.findAllByCreater(creater);
    }
    public Activity getByCreater(int creater){ return activityDao.getByCreater(creater);}
}
