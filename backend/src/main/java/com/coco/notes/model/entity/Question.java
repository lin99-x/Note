package com.coco.notes.model.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @ClassName Question
 * @Description Question entity class
 */
@Data
public class Question {
    // Question ID (primary key)
    private Integer questionId;
    // Which category it belongs to
    private Integer categoryId;
    // Question title
    private String title;
    // Question difficulty level
    private Integer difficulty;
    // Exam point
    private String examPoint;
    // View Count
    private Integer viewCount;
    // Created time
    private LocalDateTime createdAt;
    // Updated time
    private LocalDateTime updatedAt;
}
