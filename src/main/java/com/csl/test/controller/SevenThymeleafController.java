package com.csl.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * 集成Thymeleaf 表达式内置对象使用
 *
 * @author
 * @date 2020/12/4 0004 21:49:11
 */
@Controller
public class SevenThymeleafController {

    @GetMapping("/seven")
    public String seven(Model model){
        //日期时间
        Date date = new Date();
        model.addAttribute("date",date);
        //小数金额
        Double price = 123.456789;
        model.addAttribute("price",price);
        //大文本数据
        String text="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("text",text);
        //字符串
        String str = "CSL-520";
        model.addAttribute("str",str);
        return "index7";
    }
}
