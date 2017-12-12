package com.peng.meng.web.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.meng.domain.AjaxResult;
import com.peng.meng.domain.User;
import com.peng.meng.enums.LoginEnum;
import com.peng.meng.service.UserService;

/**
 * 注册
 * 
 * @author Naomi
 * @date 2017年12月12日 下午3:13:48
 * @version V1.0
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

  @Autowired
  UserService userService;


  @RequestMapping("/register")
  @ResponseBody
  public AjaxResult<String> register(User user) {
    AjaxResult<String> result = new AjaxResult<String>();
    if (user != null) {
      String username = null;
      username = user.getUsername();
      if (StringUtils.isNotBlank(username)) {
        if (userService.findByUsername(username) != null) {
          result.setCode(LoginEnum.USERNAME_EXISTED.getCode());
          result.setMessage(LoginEnum.USERNAME_EXISTED.getMsg());
          result.setSuccess(false);
        } else {
          result.setCode(LoginEnum.SUCCESS.getCode());
          result.setMessage(LoginEnum.SUCCESS.getMsg());
          result.setSuccess(true);
          user.setUserId(user.getUsername());
          userService.saveUser(user);
        }
      } else {
        result.setCode(LoginEnum.USERNAME_NULL.getCode());
        result.setMessage(LoginEnum.USERNAME_NULL.getMsg());
        result.setSuccess(false);
      }

    }
    return result;
  }
}
