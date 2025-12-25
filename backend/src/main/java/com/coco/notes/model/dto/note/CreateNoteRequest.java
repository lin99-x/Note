package com.coco.notes.model.dto.note;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateNoteRequest {
    @NotNull(message = "Question id cannot be empty")
    @Min(value = 1, message = "Question id must be positive integer")
    private Integer questionId;

    @NotBlank(message = "Content cannot be empty")
    private String content;
}
