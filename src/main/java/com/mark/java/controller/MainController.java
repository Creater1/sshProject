package com.mark.java.controller;

import com.mark.java.entity.User;
import com.mark.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String home(){
        List<User> us = new ArrayList<User>();
        User u = new User();
        u.setUsername("MarK");
        us.add(u);
        u = new User();
        u.setUsername("Fawofolo");
        us.add(u);
        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json(){
        return userService.getAllUsernames();
    }

    /*
    * 登录界面
    * */
    @RequestMapping("/admin/users/add")
    public String addUserView(){
        return "/admin/addUser";
    }
    /*
    * 登录操作
    * */
    @RequestMapping(value = "/admin/users/addP" ,method = RequestMethod.POST)
    @ResponseBody
    public String addUser(@ModelAttribute("user") User user){
         userService.addUser(user);
         return "index";
    }

}
