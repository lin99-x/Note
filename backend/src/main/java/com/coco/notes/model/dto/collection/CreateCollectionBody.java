package com.coco.notes.model.dto.collection;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateCollectionBody {
    @NotBlank(message = "Collection name cannot be empty")
    private String name;

    private String description;
}
