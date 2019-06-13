package com.leader.demo.dao;

import com.leader.demo.entity.Enterprice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriceDao extends JpaRepository<Enterprice,Object>{
    public Enterprice getByName(String name);
}
