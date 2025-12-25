package com.coco.notes.model.dto.collection;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UpdateCollectionBody {
    @NotNull(message = "Note id cannot be empty")
    @Min(value = 1, message = "Note id should be positive integer")
    private Integer noteId;

    private UpdateItem[] collections;

    @Data
    public static class UpdateItem {
        @NotNull(message = "Collection id cannot be null")
        @Min(value = 1, message = "Collection id must be positive integer")
        private Integer collectionId;

        // Action must be create or delete
        @NotNull(message = "Action cannot be null")
        @NotEmpty(message = "Action cannot be empty")
        @Pattern(regexp = "create|delete", message = "Action must be create or delete")
        private String action;
    }
}
