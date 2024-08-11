package com.backend.projeto.controllers;



import com.backend.projeto.users.User;
import com.backend.projeto.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/list")
    public ResponseEntity<List<User>> list(){

        List<User> list =  userRepository.findAll();
        return new ResponseEntity<List<User>>(list, HttpStatus.OK);

    }
    @GetMapping("/user")
    public ResponseEntity<User> user(){

        User user  = new User("Gabriel Pinto", "26", "11111111", "00000000");
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PostMapping("/user/register")
    public User register(@RequestBody User user) {

        System.out.println(user);
        return userRepository.save(user);
    }

    @PostMapping("/user/registerAll")
    public List<User> register(@RequestBody List<User> list) {

        System.out.println(list);
        return userRepository.saveAll(list);
    }
}
