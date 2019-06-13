package com.leader.demo.controller;

import com.leader.demo.entity.Detail;
import com.leader.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.leader.demo.controller.UserController;

import java.util.Map;

@Controller
public class QiyeController {
    public UserController userController;
    @RequestMapping("/qiye_index")
    public String qiye_index(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        System.out.println(UserController.all.getFull_name());
        System.out.println(UserController.all.getStudent_ID());
        System.out.println(UserController.all.getSchool());
        return "qiye_index";
    }
    @RequestMapping("/qiye1")
    public String qiye1(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye1";
    }
    @RequestMapping("/qiye2")
    public String qiye2(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye2";
    }
    @RequestMapping("/qiye3")
    public String qiye3(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye3";
    }
    @RequestMapping("/qiye6")
    public String qiye4(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye6";
    }
    @RequestMapping("/qiye7")
    public String qiye5(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye7";
    }
    @RequestMapping("/qiye4")
    public String qiye6(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye4";
    }
    @RequestMapping("/qiye5")
    public String qiyeg7(Map<String,Object> map){
        map.put("msg", "你好！    " + userController.all.getFull_name());
        map.put("name", userController.all.getFull_name());
        map.put("school", userController.all.getSchool());
        map.put("id", userController.all.getStudent_ID());
        return "qiye5";
    }
//    @RequestMapping("update")
//    public String update(Map<String,Object> map, Company company){
//        System.out.println(company.getDistrict());
//        return "";
//    }
}
