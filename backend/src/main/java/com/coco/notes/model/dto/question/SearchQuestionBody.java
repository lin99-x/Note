package com.coco.notes.model.dto.question;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SearchQuestionBody {
    @NotBlank(message = "Keyword cannot be empty")
    @Length(min = 1, max = 32, message = "Keyword should be 1 - 32 characters")
    private String keyword;
}
