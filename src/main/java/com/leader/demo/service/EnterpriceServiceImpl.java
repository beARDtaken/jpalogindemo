package com.leader.demo.service;

import com.leader.demo.dao.EnterpriceDao;
import com.leader.demo.entity.Enterprice;
import org.springframework.beans.factory.annotation.Autowired;

public class EnterpriceServiceImpl {
    @Autowired
    EnterpriceDao enterpriceDao;
    public Enterprice getid(String name){
        return enterpriceDao.getByName(name);
    }
}
