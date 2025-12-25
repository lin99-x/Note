package com.coco.notes.model.dto.question;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateQuestionBody {
    @NotBlank(message = "Title cannot be empty")
    @Length(max = 255, message = "Title cannot be longer than 255 characters")
    private String title;

    // 1 = easy, 2 = middle, 3 = hard
    @NotNull(message = "Difficulty cannot be empty")
    @Range(min = 1, max = 3, message = "Difficulty must be 1, 2, 3")
    private Integer difficulty;

    @Length(max = 255, message = "Exam point cannot be longer than 255 characters")
    private String examPoint;
}
