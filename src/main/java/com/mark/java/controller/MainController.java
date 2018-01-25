package com.mark.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, String> json(){
        Map<String, String> result = new HashMap<String, String>();
        result.put("MarK", "hello");
        result.put("Ken", "Hehe");
        result.put("Fowafolo", "fool");
        return result;
    }
}
