package com.peng.meng.enums;

/**
 * 登陆或注册错误结果
 * 
 * @author Naomi
 * @date 2017年12月12日 下午3:20:23
 * @version V1.0
 */
public enum LoginEnum {

  UNKONW_ERROR(-1, "未知错误"), SUCCESS(0, "成功"), USERNAME_EXISTED(1, "用户名已存在"), USERNAME_NOEXISTED(2,
      "用户名不存在"), PASSWORD_ERROR(3, "密码不正确"), USERNAME_NULL(4, "用户名为空"), ;

  private Integer code;

  private String msg;

  LoginEnum(Integer code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public Integer getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }


}
