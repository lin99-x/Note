package com.coco.notes.model.vo.user;

import java.time.LocalDate;

import lombok.Data;

@Data
public class LoginUserVO {
    private Long userId;
    private String account;
    private String userName;
    private Integer gender;
    private LocalDate birthday;
    private String avatarUrl;
    private String email;
    private String school;
    private String signature;
    private Integer isAdmin;
}
