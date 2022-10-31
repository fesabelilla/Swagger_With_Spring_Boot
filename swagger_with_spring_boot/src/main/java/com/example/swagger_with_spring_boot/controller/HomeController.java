package com.example.swagger_with_spring_boot.controller;

import com.example.swagger_with_spring_boot.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/***
 * http://localhost:8989/swagger-ui.html
 */


@RestController
public class HomeController {

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = new ArrayList<>();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
