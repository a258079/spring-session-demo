package com.csl.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 将数据message填充到templates/csl.html
 *
 * @author
 * @date 2020/12/4 0004 21:41:14
 */
@Controller
public class SixAndCslThymeleafController {
    @GetMapping("/six")
    public String six(Model model){
        return "index6";
    }
}
