package com.jbit.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbit.entity.AuUser;
import com.jbit.service.AuUserService;


@Controller
public class AuUerController {
	   @Resource
	     private AuUserService auUserService;
	     
	     @RequestMapping("/login")
	     public String login(Model model,HttpSession session,String loginCode,String password) {
			 AuUser user=auUserService.getlogin(loginCode, password);
			 if(user!=null){				 
				 model.addAttribute("user", user);
				 return "/pages/index.jsp";
			 }else{
				 model.addAttribute("error", "用户名或密码错误！");
			 }
			 
	    	 return "index.jsp";
		}
}
