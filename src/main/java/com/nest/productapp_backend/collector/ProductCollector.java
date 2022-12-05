package com.nest.productapp_backend.collector;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCollector {

    @PostMapping("/")
    public String homepage(){
        return "Welcome to my website";
    }

    @PostMapping("/add")
    public String addpage(){
        return "Welcome to add page";
    }

    @PostMapping("/search")
    public String searchpage(){
        return "Welcome to search page";
    }

    @PostMapping("/edit")
    public String editpage(){
        return "Welcome to edit page";
    }

    @PostMapping("/delete")
    public String deletepage(){
        return "Welcome to delete page";
    }
}
