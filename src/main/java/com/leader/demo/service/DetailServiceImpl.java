package com.leader.demo.service;
import com.leader.demo.dao.DetailDao;
import com.leader.demo.entity.Detail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailServiceImpl {
    @Autowired
    DetailDao detailDao;

    public Detail getDetil(String number,String password){
        return detailDao.getByNumberAndPassword(number,password);
    }
    public void insert(Detail detail){detailDao.save(detail);}
    public Detail getByNumber(String number){ return detailDao.getByNumber(number); };
    public int updateDetail(String full_name,String student_ID,String email,String school,String username){
        return detailDao.updateDetail(full_name,student_ID,email,school,username);
    }
    public List<Detail> FindAll(){
        return detailDao.findAllBy();
    }
}
