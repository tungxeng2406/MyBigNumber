package com.example.mybignumber.web.controller;

import com.example.mybignumber.MyBigNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyBigNumberController {

    private final MyBigNumber myBigNumber;

    public MyBigNumberController(MyBigNumber myBigNumber) {
        this.myBigNumber = myBigNumber;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/add")
    public String add(@RequestParam String firstNumber,
                      @RequestParam String secondNumber,
                      Model model) {
        try {
            String str1 = firstNumber;
            String str2 = secondNumber;
            String result = myBigNumber.sum(str1, str2);
            List<String> history = myBigNumber.getHistory(str1, str2);
            model.addAttribute("result", result);
            model.addAttribute("history", history);
            model.addAttribute("firstNumber", firstNumber);
            model.addAttribute("secondNumber", secondNumber);
            return "index";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "index";
        }
    }
}
