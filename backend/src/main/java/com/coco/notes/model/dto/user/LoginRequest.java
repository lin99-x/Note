package com.coco.notes.model.dto.user;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/* Log in request DTO */
@Data
public class LoginRequest {
    // Account name
    @Size(min = 6, max = 32, message = "Account length must be between 6 and 32 characters")
    @Pattern(regexp = "[a-zA-Z0-9_]+$", message = "Account names can only contain letters, numbers and underscores")
    private String account;

    // Email
    @Email(message = "Invalid Email format")
    private String email;

    // Log in password
    @NotBlank(message = "Password cannot be empty")
    @Size(min = 6, max = 32, message = "Password length must be between 6 and 32 characters")
    private String password;

    @AssertTrue(message = "Must provide account or email")
    private boolean isValidLogin() {return account != null || email != null;}
}
