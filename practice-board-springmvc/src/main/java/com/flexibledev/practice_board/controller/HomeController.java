package com.flexibledev.practice_board.controller;

import com.flexibledev.practice_board.entity.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        Post post = new Post();
        return "index";
    }
}
