package com.coco.notes.model.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @ClassName User
 * @Description User entity class
 */
@Data
public class User {
    // User ID (primary key), cannot change
    private Long userId;
    // Account (cannot change)
    private String account;
    // User name
    private String userName;
    // Password
    private String password;
    // Gender
    private Integer gender;
    // Birthday
    private LocalDate birthday;
    // Avatar
    private String avatarUrl;
    // Email
    private String email;
    // Schoo;
    private String school;
    // Signature
    private String signature;
    // If its banned (0=normal, 1=banned)
    private Integer isBanned;
    // If its admin (0=normal, 1=admin)
    private Integer isAdmin;
    // Last login time
    private LocalDateTime lastLoginAt;
    // Created time
    private LocalDateTime createdAt;
    // Updated time
    private LocalDateTime updatedAt;
}
