package com.csl.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO
 *
 * @author
 * @date 2020/12/4 0004 19:27:59
 */
@Controller
public class FiveThymeleafController {
    @GetMapping("/five")
    public String five(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("admin","admin");
        model.addAttribute("csl","csl");
        return "index5";
    }
}
