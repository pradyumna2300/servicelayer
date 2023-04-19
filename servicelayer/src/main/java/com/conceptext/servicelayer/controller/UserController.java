package com.conceptext.servicelayer.controller;

import com.conceptext.servicelayer.dto.UserDTO;
import com.conceptext.servicelayer.entity.User;
import com.conceptext.servicelayer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register-data")
    private ResponseEntity<String> registerUser(@RequestBody User user){
        //save the user
        String msg = userService.saveUser(user);

        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }

    @GetMapping("/user-data")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

}
