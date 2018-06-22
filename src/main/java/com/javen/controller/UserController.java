package com.javen.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import com.javen.model.User;
import com.javen.service.UserService;
  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    private static Logger log=LoggerFactory.getLogger(UserController.class);
      
    @Autowired
    private UserService userService;
    // /user/test?id=1
    @RequestMapping(value="/test",method=RequestMethod.GET)  
    public String test(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = userService.getUserById(userId);
        log.debug(user.toString());
        //int a=5/0;
        model.addAttribute("user", user);  
        return "user";  
    }  
}  