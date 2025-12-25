package com.coco.notes.model.dto.questionListItem;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateQuestionListItemBody {
    @NotNull(message = "Question list Id cannot be empty")
    @Min(value = 1, message = "Question list Id must be positive integer")
    private Integer questionListId;

    @NotNull(message = "Question Id cannot be empty")
    @Min(value = 1, message = "Question Id must be positive integer")
    private Integer questionId;
}
