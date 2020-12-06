package com.csl.test.controller;

import com.csl.test.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Thymeleaf 模板练习
 *
 * @author
 * @date 2020/12/4 0004 17:26:49
 */
@Controller
public class UserController {

    @GetMapping("/second")
    public String indexPage2(Model model){
        model.addAttribute("msg","Thymeleaf,您好!");
        User user = new User(1,"张三",19);
        Map map = new HashMap();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        map.put("src3","3.jpg");
        model.addAttribute("user",user);
        model.addAttribute("map",map);
        return "index2";
    }
}
