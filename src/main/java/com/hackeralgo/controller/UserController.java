package com.hackeralgo.controller;

import com.hackeralgo.entity.User;
import com.hackeralgo.service.UserService;
import com.hackeralgo.dto.UserDTO;
import com.hackeralgo.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@Valid @RequestBody UserDTO userDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ValidationException("Invalid user data", bindingResult);
        }

        User user = userService.convertToUser(userDTO);
        User savedUser = userService.signUp(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/user/{mobileNumber}")
    public ResponseEntity<User> getUserByMobileNumber(@PathVariable Long mobileNumber) {
        User user = userService.getUserByMobileNumber(mobileNumber);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
