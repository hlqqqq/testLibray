package com.hlq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by heliqing on 2016/11/10.
 */
@Controller
@RequestMapping("/mvc")
public class MvcController {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request,HttpServletResponse response,ModelMap model){
        model.addAttribute("user","xx");
        Map<String,String> map=new HashMap<String, String>();
        map.put("name", "xx");
        return "blank";
    }
}
