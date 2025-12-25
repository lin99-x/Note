package com.coco.notes.model.dto.category;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateCategoryBody {
    @NotBlank(message = "Name cannot be empty")
    @Length(max = 32, min =  1, message = "Name should be 1 - 32 characters")
    private String name;

    @NotNull(message = "parentCategoryId cannot be empty")
    @Min(value = 0, message = "parentCategoryId should be postive integer")
    private Integer parentCategoryId;
}
