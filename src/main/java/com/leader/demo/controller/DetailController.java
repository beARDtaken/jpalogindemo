package com.leader.demo.controller;

import com.leader.demo.entity.Detail;
import com.leader.demo.entity.User;
import com.leader.demo.service.DetailServiceImpl;
import com.leader.demo.service.UserServiceImpl;
import org.omg.Dynamic.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
@Controller
public class DetailController {
    @RequestMapping("/Sign_up")
    public String Sign_up(){return "Sign_up";}
    @Autowired
    DetailServiceImpl detailService;
    @Autowired
    UserServiceImpl userService;
    public String school;
    public Detail detail;
    public String usn="";
    public String pwd="";
    public String email="";
    public String full_name="";
    public String category="";
    public String student_ID="";
    public User user;
    @RequestMapping("doFirst")
    public String doTest(User user1,Detail detail1){
        System.out.println(user1.getUsername());
        System.out.println(user1.getPassword());
        usn=user1.getUsername();
        pwd=user1.getPassword();
        email=detail1.getEmail();
        System.out.println(email);
        return "redirect:http://localhost:8080/Sign_up_2";
    }
    @RequestMapping("doNext")
    public String doNext(Detail detail1){
        full_name=detail1.getFull_name();
        category=detail1.getCategory();
        student_ID=detail1.getStudent_ID();
        System.out.println(detail1.getCategory());
        System.out.println(detail1.getFull_name());
        System.out.println(detail1.getStudent_ID());
        detail.setPassword(pwd);
        detail.setEmail(email);
        detail.setStudent_ID(student_ID);
        System.out.println(detail.getEmail());
        System.out.println(detail.getNumber());
        System.out.println(detail.getPassword());
        detail.setFull_name(full_name);
        detail.setNumber(usn);
        detail.setCategory(category);
        userService.insertUser(user);
        detailService.insert(detail);
        return "redirect:http://localhost:8080/login";
    }
    @RequestMapping("/Sign_up_2")
    public String Sign_up_2(){return "Sign_up_2";}
    @RequestMapping("/List")
    public List<Detail> list(){
        List<Detail> detailListetail = detailService.FindAll();
        return detailListetail;
    }
}
