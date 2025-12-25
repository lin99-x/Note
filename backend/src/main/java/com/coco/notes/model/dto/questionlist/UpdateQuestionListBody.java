package com.coco.notes.model.dto.questionlist;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateQuestionListBody {
    @NotBlank(message = "Name cannot be empty")
    @Length(min = 1, max = 32, message = "Name must be 1 - 32 characters")
    private String name;

    @Range(min = 1, max = 2, message = "Type must be 1 or 2")
    private Integer type;

    @Length(max = 255, message = "Description cannot be longer than 255 characters")
    private String description;
}
