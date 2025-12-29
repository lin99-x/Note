package com.coco.notes.model.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @ClassName QuestionListItem
 * @Description QuestionList-Question related entity class
 */
@Data
public class QuestionListItem {
    // Question list ID (composite primary key)
    private Integer questionListId;
    // Question ID (composite primary key)
    private Integer questionId;
    // Question sequence in question list, start from 1
    private Integer rank;
    // Created time
    private LocalDateTime createdAt;
    // Updated time
    private LocalDateTime updatedAt;
}
