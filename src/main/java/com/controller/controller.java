package com.controller;

import com.po.Uses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class controller {
   @RequestMapping(value = "check.do",method = RequestMethod.GET)
 public ModelAndView check(HttpServletRequest request, HttpServletResponse response,Uses uses){
  ModelAndView modelAndView=new ModelAndView();
  if(uses!=null){
      modelAndView.addObject("us",uses);
      modelAndView.setViewName("ok.jsp");

  }
       return modelAndView;
 }
}
    /*ModelAndView mv=new ModelAndView();
       if(uses!=null){
               mv.addObject("us",uses);
               mv.setViewName("ok.jsp");
               return mv;
               }
               mv.setViewName("errop.jsp");
               return mv;*/