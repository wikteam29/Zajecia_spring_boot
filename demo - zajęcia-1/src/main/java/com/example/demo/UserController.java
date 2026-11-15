package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

//    @GetMapping("/hello")
//    public String sayHello(){
//        return userService.sayHello();
//    }

    @RequestMapping(value = "/discPrice/{price}")
    public String getUser(@PathVariable double price) {
        return userService.getDiscountPrice(price);
    }
}
