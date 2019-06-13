package com.leader.demo.controller;
import com.leader.demo.controller.UserController;
import com.leader.demo.entity.Detail;
import com.leader.demo.entity.User1;
import com.leader.demo.service.DetailServiceImpl;
import com.leader.demo.service.User1ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
public class SchController {
    @Autowired
    public UserController userController;
    @Autowired
    public DetailServiceImpl detailService;
    @Autowired
    public User1ServiceImpl user1Service;
    @RequestMapping("/sch_index")
    public String sch_index(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "sch_index";
    }
    @RequestMapping("/sch1")
    public String sch1(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "sch1";
    }
    @RequestMapping("/sch2.1")
    public String sch2(Map<String,Object> map, Model model){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        List<Map<String,Object>> resultList =new ArrayList<Map<String,Object>>();
        for(User1 user1:user1Service.finduniversity(userController.all.getSchool())){
            Map<String,Object> student =new HashMap<String, Object>(){{
                put("uid",user1.getId());
                put("name",user1.getCname());
                put("phone",user1.getMobile());
                put("grade",user1.getEducation_id());
                put("email",user1.getEmail());
                put("school",user1.getUniversity());
            }};
            resultList.add(student);
            model.addAttribute("resultList",resultList);
        }
        return "sch2.1";
    }
    @RequestMapping("/sch2.2")
    public String sch3(Map<String,Object> map,Model model){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        List<Map<String,Object>> resultList =new ArrayList<Map<String,Object>>();
        for(User1 user1:user1Service.finduniversity(userController.all.getSchool())){
            Map<String,Object> student =new HashMap<String, Object>(){{
                put("uid",user1.getId());
                put("name",user1.getCname());
                put("time",user1.getModified_date());
                put("school",user1.getUniversity());
            }};
            resultList.add(student);
            model.addAttribute("resultList",resultList);
        }
        return "sch2.2";
    }
    @RequestMapping("/sch2.3")
    public String sch4(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "sch2.3";
    }
    @RequestMapping("/sch2.4")
    public String sch5(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "sch2.4";
    }
    @RequestMapping("/sch4")
    public String sch6(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "sch4";
    }
    @RequestMapping("/sch5")
    public String sch7(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "sch5";
    }

}
