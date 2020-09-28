package com.airbus.airfit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex() {

        return "index";
    }

    @GetMapping("/dashboard")
    public String getDashboard() {

        return "dashboard";
    }
}
