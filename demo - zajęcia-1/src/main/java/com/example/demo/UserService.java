package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public String sayHello(){
        final String name = userRepository.getName();

        return "Siema, " + name;
    }
}
