package com.peng.meng.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;

public class LogoutHandle implements LogoutHandler {
  private final static Logger logger = LoggerFactory.getLogger(LogoutHandle.class);

  @Override
  public void logout(HttpServletRequest request, HttpServletResponse response,
      Authentication authentication) {}

}
