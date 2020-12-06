package com.csl.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO
 *
 * @author
 * @date 2020/12/4 0004 19:12:27
 */
@Controller
public class FourThymeleafController {

    @GetMapping("/four")
    public String four(Model model){
        model.addAttribute("name","csl");
        model.addAttribute("url","http://com.csl520.xyz");
        return "index4";
    }
}
