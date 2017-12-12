package com.peng.meng.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.peng.meng.domain.User;

@RequestMapping("/user")
public class UserController {

  @RequestMapping("/login")
  public String login() {

    return "/user/login";
  }


  public String addUser(User user) {
    return "";
  }
}
