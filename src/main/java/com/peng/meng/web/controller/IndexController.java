package com.peng.meng.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class IndexController {

  @RequestMapping("/start")
  public String index() {
    return "/public/start";
  }

  @RequestMapping("/end")
  public String end() {
    return "/public/end";
  }
}
