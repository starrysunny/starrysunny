package com.starrysunny.starrysunny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author starrysunny
 * @since 2021/9/9
 */
@Controller
public class IndexController {

    @RequestMapping({"/","/index"})
    public String index () {
        return "redirect:/index.html";
    }
}
