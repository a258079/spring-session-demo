package com.csl.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * sseeion测试类
 *
 * @author
 * @date 2020/12/4 0004 16:43:36
 */
@RestController
public class TestController {
    @Autowired
    private HttpSession session;

    @GetMapping("/setSession")
    public String setSession(){
        session.setAttribute("msg","大佬牛逼啊!!");
        return "ok";
    }

    @GetMapping("/getSession")
    public String getSession(){
        return (String) session.getAttribute("msg");
    }

}
