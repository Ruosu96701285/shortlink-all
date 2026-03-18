package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * 用户管理控制层
 */
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/api/shortlink/admin/v1/user/{username}") 
    public UserRespDTO getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }

}