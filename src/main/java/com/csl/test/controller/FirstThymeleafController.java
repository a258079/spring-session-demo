package com.csl.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO
 *
 * @author
 * @date 2020/12/4 0004 16:59:42
 */
@Controller
public class FirstThymeleafController {
    @GetMapping("/first")
    public String indexPage(Model model){
        model.addAttribute("message","世界,您好!");
        return "index";
    }
}
