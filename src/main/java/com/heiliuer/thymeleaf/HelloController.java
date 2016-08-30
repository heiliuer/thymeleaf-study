package com.heiliuer.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/8/30 0030.
 */

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("hello", "hello thymleafs!");
        return "index";
    }
}
