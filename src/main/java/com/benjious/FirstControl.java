package com.benjious;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstControl {

    @RequestMapping("/home")
    public String helloworld(){
        return "index";

    }
}
