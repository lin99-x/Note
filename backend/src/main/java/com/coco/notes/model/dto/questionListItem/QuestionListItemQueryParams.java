package com.coco.notes.model.dto.questionListItem;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class QuestionListItemQueryParams {
    @NotNull(message = "Question list Id cannot be empty")
    @Min(value = 1, message = "Question list Id must be positive integer")
    private Integer questionListId;

    @NotNull(message = "Page cannot be empty")
    @Min(value = 1, message = "Page must be positive integer")
    private Integer page;

    @NotNull(message = "Page size cannot be empty")
    @Range(min = 1, max = 100, message = "Page size must be 1 - 100")
    private Integer pageSize;
}
