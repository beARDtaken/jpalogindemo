package com.leader.demo.controller;

import com.leader.demo.entity.Information;
import com.leader.demo.service.InformationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import net.sf.json.JSONArray;
@Controller
public class InformationController extends HttpServlet {
    public InformationServiceImpl informationService;
    @RequestMapping("test.do")
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Information> array=informationService.getAll();
        response.setContentType("text/html; charset=utf-8");
        JSONArray json=JSONArray.fromObject(array);
        System.out.println(array.toString());
        PrintWriter out =response.getWriter();
        out.println(json);
        out.flush();
        out.close();
    }
}
