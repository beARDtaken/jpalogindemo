package com.leader.demo.controller;

import com.leader.demo.entity.Activity;
import com.leader.demo.entity.Detail;
import com.leader.demo.entity.User;
import com.leader.demo.service.ActivityImpl;
import com.leader.demo.service.DetailServiceImpl;
import com.leader.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    DetailController detailController;
    @Autowired
    UserServiceImpl userServiceImpl;
    @Autowired
    DetailServiceImpl detailService;
    @Autowired
    ActivityImpl activityService;
    public static Detail all;
    @RequestMapping("/login")
    public String login(){
        return "Sign_in";
    }

    @RequestMapping("doLogin")
    public String doLogin(User user, Map<String,Object> map){
        User user1 =  userServiceImpl.getUser(user.getPassword(),user.getUsername());
        if(user1 == null){
            map.put("msg","李若阳");
            return "redirect:http://localhost:8080/login";
        }else {
            all = detailService.getByNumber(user1.getUsername());
            map.put("msg", "你好！    " + all.getFull_name());
            map.put("name", all.getFull_name());
            map.put("school", all.getSchool());
            map.put("id", all.getStudent_ID());
            for(Detail detail:detailService.FindAll()){
                System.out.println(detail.getEmail());
            }

            if (all.getCategory().equals("s")) {
                return "redirect:http://localhost:8080/index";
            } else if (all.getCategory() .equals("e") ) {
                return "redirect:http://localhost:8080/qiye_index";
            }else {return "redirect:http://localhost:8080/sch_index" ;}
        }
    }
    @RequestMapping("/qiye")
    public String regist(){
        return "qiye1";
    }
    @RequestMapping("doRegist")
    public String doRegist(User user, Map<String,Object> map){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        userServiceImpl.insertUser(user);
        map.put("msg","注册成功");
        return "success";
    }
    @RequestMapping("/index")
    public String index(Map<String,Object> map){
        map.put("msg","你好！    "+all.getFull_name());
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        return "index";
    }
    @RequestMapping("/stu2")
    public String stu2(Map<String,Object> map){
        map.put("msg","你好！    "+all.getFull_name());
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        return "stu2";
    }
    @RequestMapping("/stu3")
    public String stu3(Map<String,Object> map,Model model){
        map.put("msg","你好！    "+all.getFull_name());
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        List<Map<String,Object>> resultList =new ArrayList<Map<String,Object>>();
        for(Detail detail:detailService.FindAll()){
            System.out.println(detail.getEmail());
            Map<String,Object> student =new HashMap<String, Object>(){{
                put("sname",detail.getFull_name());
                put("sid",detail.getEmail());
            }};
            resultList.add(student);
            model.addAttribute("resultList",resultList);
        }
        return "stu3";
    }
    @RequestMapping("stu33")
    public String stu33(Map<String,Object>map, Model model){
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        map.put("msg","你好！    "+all.getFull_name());
        List<Map<String,Object>> resultList =new ArrayList<Map<String,Object>>();
        for(Detail detail:detailService.FindAll()){
            System.out.println(detail.getEmail());
            Map<String,Object> student =new HashMap<String, Object>(){{
                put("sname",detail.getFull_name());
                put("sid",detail.getEmail());
            }};
            resultList.add(student);
            model.addAttribute("resultList",resultList);
        }
        return "stu33";
    }
    @RequestMapping("/stu4")
    public String stu4(Map<String,Object> map,Model model){
        map.put("msg","你好！    "+all.getFull_name());
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        List<Map<String,Object>> resultList =new ArrayList<Map<String,Object>>();
        for(Activity activity:activityService.findAll()){
            Map<String,Object> student =new HashMap<String, Object>(){{
                put("creater",activity.getCreater());
                put("activity",activity.getActivity());
                put("sid",activity.getId());
                put("time",activity.getCreated_date());
            }};
            resultList.add(student);
            model.addAttribute("resultList",resultList);
        }
        return "stu4";
    }
    @RequestMapping("/stu5")
    public String stu5(Map<String,Object> map){
        map.put("msg","你好！    "+all.getFull_name());
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        return "stu5";
    }
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    @RequestMapping("update")
    public String update(User user, Map<String,Object> map,Detail detail){
        userServiceImpl.update(user.getPassword(),user.getUsername());
        detail.setNumber(user.getUsername());
        detail.setPassword(user.getPassword());
        detailService.updateDetail(detail.getFull_name(),detail.getStudent_ID(),detail.getEmail(),detail.getSchool(),all.getNumber());
        return "redirect:http://localhost:8080/stu2";
    }
    @RequestMapping("updateUser")
    public String updatePassword(User user,Map<String,Object>map,Detail detail){
        System.out.println(user.getUsername());
        if(user.getUsername().equals(all.getNumber()))
        {
            userServiceImpl.update(user.getPassword(),user.getPassword());
        }
        return "redirect:http://localhost:8080/stu2";
    }
    @RequestMapping("check")
    public String check(Map<String,Object>map){
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        return "check";
    }
    @RequestMapping("stu7")
    public String stu7( Map<String,Object>map){
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        return "实习要求";
    }
    @RequestMapping("echarts")
    public String echarts( Map<String,Object>map){
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        return "企业查询学校";
    }
    @RequestMapping("echarts2")
    public String echarts2( Map<String,Object>map){
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        return "学校查询企业";
    }
    @RequestMapping("echarts3")
    public String echarts3( Map<String,Object>map){
        map.put("school",all.getSchool());
        map.put("name",all.getFull_name());
        map.put("id",all.getStudent_ID());
        return "月总结";
    }
}
