package com.coco.notes.model.dto.comment;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateCommentRequest {
    @NotBlank(message = "Comment cannot be empty")
    private String content;
}
