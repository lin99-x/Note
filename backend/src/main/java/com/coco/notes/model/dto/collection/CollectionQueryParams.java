package com.coco.notes.model.dto.collection;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CollectionQueryParams {
    @NotNull(message = "Creator id cannot be empty")
    @Min(value = 1, message = "Creator id must be positive integer")
    private Long creatorId;

    @Min(value = 1, message = "Note id must be positive integer")
    private Integer noteId;
}
