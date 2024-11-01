package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping("/user")
  public User createUser(User user) {
    userService.createUser(user);
    return user;
  }

  @GetMapping("/user")
  public List<User> getAllUser(){
    return userService.readAllUser();
  }

  @GetMapping("/user/{userId}")
  public User getUser(@PathVariable("userId") int userId){
    return userService.readOneUser(userId);
  }

  @PatchMapping("/user/{userId}")
  public User updateUser(@PathVariable("userId") int userId, @RequestBody User user){
    return userService.updateUser(userId, user);
  }

  @DeleteMapping("/user/{userId}")
  public void deleteUser(@PathVariable("userId") int userId){
    userService.deleteUser(userId);
  }
}
