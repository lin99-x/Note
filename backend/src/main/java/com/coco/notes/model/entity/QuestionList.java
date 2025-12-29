package com.coco.notes.model.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @ClassName QuestionList
 * @Description QuestionList entity class
 */
@Data
public class QuestionList {
    // Question list ID (primary key)
    private Integer questionListId;
    // Question list name
    private String name;
    // Question list type
    private Integer type;
    // Question list description
    private String description;
    // Created time
    private LocalDateTime createdAt;
    // Updated time
    private LocalDateTime updatedAt;
}
