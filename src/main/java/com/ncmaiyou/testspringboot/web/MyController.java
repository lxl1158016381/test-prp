package com.ncmaiyou.testspringboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author luoxinlin
 * @date 2021/9/5 17:25
 * @description
 */
@Controller
public class MyController {

    @RequestMapping("test")
    @ResponseBody
    public String test(Model model) {
        System.out.println("测试成功");
        return "Hello Maven!";
    }


}
