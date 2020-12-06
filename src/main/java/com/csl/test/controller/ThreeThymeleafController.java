package com.csl.test.controller;

import com.csl.test.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Thymeleaf循环遍历集合
 *
 * @author
 * @date 2020/12/4 0004 18:57:26
 */
@Controller
public class ThreeThymeleafController {

    @GetMapping("three")
    public String three(Model model){
        User user1 = new User(1,"张三",19);
        User user2 = new User(2,"李四",20);
        User user3 = new User(3,"王五",21);
        List userList = new ArrayList();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        model.addAttribute("userList",userList);
        return "index3";
    }
}
