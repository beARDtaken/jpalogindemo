package com.leader.demo.service;

import com.leader.demo.dao.InformationDao;
import com.leader.demo.entity.Information;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InformationServiceImpl {
    @Autowired
    InformationDao informationDao;

    public List<Information> getAll(){
        return informationDao.findAll();
    }
}
