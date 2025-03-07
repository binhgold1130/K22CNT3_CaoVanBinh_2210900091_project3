package com.electricity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    public HomeController() {
        // Constructor mặc định
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("message", "Chào mừng bạn đến với hệ thống quản lý điện!");
        return "home"; // Trả về trang home.jsp hoặc home.html (tùy vào cấu hình ViewResolver)
    }
}
