package com.hlq.dao.impl;



import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

/**
 * Created by heliqing on 2016/11/17.
 */
public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("message","hello,mvc,我来了");
        mv.setViewName("helloWorld");
        return mv;
    }
}
