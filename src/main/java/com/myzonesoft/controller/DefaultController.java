package com.myzonesoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Prashanth Bhat on 26-04-2023
 */
@Controller
public class DefaultController {
    //Homepage - Default Page
    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    //Admin Page - to be accessed by Admin and Super Admin
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    //User Page - to be accessed by User and Super Admin
    @GetMapping("/user")
    public String user() {
        return "user";
    }

    //Super Admin Page - to be accessed by Super Admin
    @GetMapping("/super_admin")
    public String super_admin() {
        return "super_admin";
    }

    //About Page - No Login required
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
