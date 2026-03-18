package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

@Data
public class UserReqDTO {
    private String username;
    private String password;
    private String realName;
    private String phone;
    private String mail;
}
