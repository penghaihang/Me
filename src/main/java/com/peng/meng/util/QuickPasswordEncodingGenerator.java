package com.peng.meng.util;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class QuickPasswordEncodingGenerator {
	
    
    public static void main(String[] args) {
    	String password = "abc125";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.matches("abc125", "$2a$10$eIx9QLhUf4rndpA0QD8O2uKktPCjkZy.9qj9.w3wIx.oBHk.k3uJa"));
        System.out.println(passwordEncoder.encode(password));	
	}
}
