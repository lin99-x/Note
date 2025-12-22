package com.coco.notes.model.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/* User register request DTO */
@Data
public class RegisterRequest {
    // Account name (required), length 6-32, must be letter, number or underscore
    @NotBlank(message = "Account name cannot be empty")
    @Size(min = 6, max = 32, message = "Account length must be between 6 and 32 characters")
    @Pattern(regexp = "[a-zA-Z0-9_]+$", message = "Account names can only contain letters, numbers and underscores")
    private String account;

    // User name (required), length 1-16, must be letter, number or underscore
    @NotBlank(message = "User name cannot be empty")
    @Size(max = 16, message = "User name cannot be longer than 16 characters")
    @Pattern(regexp = "[a-zA-Z0-9_]+$", message = "User name can only contain letters, numbers and underscores")
    private String userName;

    // Password (required), length 16-32
    @NotBlank(message = "Password cannot be empty")
    @Size(min = 6, max = 32, message = "Password length must be between 6 and 32 characters")
    private String password;

    // Email (optional)
    @Email
    private String Email;

    // Verify Code (optional, required when email is given)
    @Size(min = 6, max = 6, message = "Verification code must be 6 characters")
    private String verifyCode;
}
