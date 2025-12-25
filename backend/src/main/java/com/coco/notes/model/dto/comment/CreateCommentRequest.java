package com.coco.notes.model.dto.comment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateCommentRequest {
    @NotNull(message = "Note id cannot be empty")
    private Integer noteId;

    private Integer parentCommentId;

    @NotBlank(message = "Content cannot be empty")
    private String content;
}
