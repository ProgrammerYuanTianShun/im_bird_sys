package org.luminary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author programmerYuan
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/user_list")
    public String userList(){
        return "user_list";
    }
}
