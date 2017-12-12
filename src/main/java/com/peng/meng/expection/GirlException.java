package com.peng.meng.expection;

import com.peng.meng.enums.ResultEnum;

public class GirlException extends RuntimeException {

  private static final long serialVersionUID = -259741347968357237L;
  private Integer code;

  public GirlException(ResultEnum resultEnum) {
    super(resultEnum.getMsg());
    this.code = resultEnum.getCode();
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }
}
