package com.coco.notes.model.dto.user;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserQueryParam {
    // User ID, must be positive integer
    @Min(value = 1, message = "User ID must be positive integer")
    private Integer userId;

    // Account name
    private String account;

    // User name
    @Length(max = 16, message = "User name cannot be longer than 16 characters")
    private String userName;

    // If it's banned
    @Min(value = 0, message = "Invalid input, minimum input could be 0")
    @Max(value = 1, message = "Invalid input, maximum input could be 1")
    private Integer isBanned;

    // If it's admin
    @Min(value = 0, message = "Invalid input, minimum input could be 0")
    @Max(value = 1, message = "Invalid input, maximum input could be 1")
    private Integer isAdmin;

    // Page
    @NotNull(message = "Page cannot be empty")
    @Min(value = 1, message = "Page must be positive integer")
    private Integer page;

    // Page size
    @NotNull(message = "Page size cannot be empty")
    @Min(value = 1, message = "Page size must be positive integer")
    @Max(value = 200, message = "Page size cannot be larger than 200")
    private Integer pageSize;
}
