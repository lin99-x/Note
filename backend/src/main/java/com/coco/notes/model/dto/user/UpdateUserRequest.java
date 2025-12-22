package com.coco.notes.model.dto.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/* Update user information request DTO */
@Data
public class UpdateUserRequest {
    // User name (optional), length 1-16, must be letter, number or underscore
    @Size(max = 16, message = "User name cannot be longer than 16 characters")
    @Pattern(regexp = "[a-zA-Z0-9_]+$", message = "User name can only contain letters, numbers and underscores")
    private String userName;

    // Gender (optional), 1 = man, 2 = woman, 3 = Prefer not to tell
    @Min(value = 1, message = "Invalid gender")
    @Max(value = 3, message = "Invalid gender")
    private Integer gender;

    // Birthday (optional), must be a date in the past
    @Past(message = "Birthday must be in the past")
    private LocalDate birthday;

    // Profile picture URL (optional), must be valid URL
    @Pattern(regexp = "^(https?|ftp)://.*$", message = "Profile picture does not have valid URL")
    private String avatarUrl;

    // Email (optional)
    @Email(message = "Invalid email address")
    private String email;

    // Bio (optional), must be 1 - 128 characters
    @Size(max = 128, message = "Bio cannot be longer than 128 characters")
    private String bio;
}
