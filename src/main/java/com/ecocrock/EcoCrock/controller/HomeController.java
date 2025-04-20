package com.ecocrock.EcoCrock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    } 
    @GetMapping("/plates")
    public String plates() {
        return "plates";
    } 
    @GetMapping("/bowls")
    public String bowls() {
        return "bowls";
    } 
    @GetMapping("/contact-us")
    public String ConatctUs() {
        return "contact-us";
    } 
    
}