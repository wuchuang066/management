package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("js")
public class JSController {

    @RequestMapping("/testForm")
    private Integer testFrom(@RequestParam(value = "fname", required = true) String name, @RequestParam(value = "fpass", required = true) String pass) {
        System.out.println("name:" + name + "pass:" + pass);
        return 0;
    }
}
