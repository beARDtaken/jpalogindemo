package com.leader.demo.dao;

import com.leader.demo.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InformationDao extends JpaRepository<Information,Object> {
    public List<Information> findAll();
}
