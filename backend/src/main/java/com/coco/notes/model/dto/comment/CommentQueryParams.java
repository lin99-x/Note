package com.coco.notes.model.dto.comment;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CommentQueryParams {
    @NotNull(message = "Note id cannot be empty")
    private Integer noteId;

    @NotNull(message = "Page cannot be empty")
    @Min(value = 1, message = "Page must be positive integer")
    private Integer page;

    @NotNull(message = "Page size cannot be empty")
    @Range(max = 200, message = "Page size cannot be larger than 200")
    private Integer pageSize;
}
