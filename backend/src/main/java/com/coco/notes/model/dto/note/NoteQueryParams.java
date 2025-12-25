package com.coco.notes.model.dto.note;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class NoteQueryParams {
    @Min(value = 1, message = "Question id must be positive integer")
    private Integer questionId;

    @Min(value = 1, message = "Author id must be positive integer")
    private Integer authorId;

    @Min(value =  1, message = "Collection id must be positive integer")
    private Integer collectionId;

    @Pattern(regexp = "^(create)$", message = "Sort must based on create")
    private String sort;

    @Pattern(regexp = "^(asc|desc)$", message = "Order must be asc or desc")
    private String order;

    @Min(value = 1, message = "Recent days at least should be 1")
    @Max(value = 365, message = "Recent days at most could be 365")
    private Integer recentDays;

    @NotNull(message = "Page cannot be empty")
    @Min(value = 1, message = "Page must be positive integer")
    @Max(value = 10000, message = "Page cannot be larger than 10000")
    private Integer page;

    @NotNull(message = "Page size cannot be empty")
    @Range(min = 1, max = 100, message = "Page size must be 1 - 100")
    private Integer pageSize;
}
