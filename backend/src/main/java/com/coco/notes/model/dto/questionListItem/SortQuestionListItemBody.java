package com.coco.notes.model.dto.questionListItem;

import java.util.List;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SortQuestionListItemBody {
    @NotNull(message = "Question list Id cannot be empty")
    @Min(value = 1, message = "Question list Id must be positive integer")
    private Integer questionListId;

    @NotNull(message = "Question list item ids cannot be empty")
    private List<Integer> questionIds;
}
