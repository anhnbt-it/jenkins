package com.anhnbt.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 * Date: 10/29/2021
 * Time: 3:13 PM
 */
@RestController
public class HomeController {

    @GetMapping
    public String greetings() {
        return "Hello World!";
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
