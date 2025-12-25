package com.coco.notes.model.dto.category;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateCategoryBody {
    @NotBlank(message = "Name cannot be empty")
    @Length(max = 32, min = 1, message = "Name should be 1 - 32 characters")
    private String name;
}
