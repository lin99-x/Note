package com.coco.notes.model.dto.note;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateNoteRequest {
    @NotBlank(message = "Content cannot be empty")
    private String content;
}
