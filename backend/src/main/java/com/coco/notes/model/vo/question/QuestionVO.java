package com.coco.notes.model.vo.question;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * For admin query questions
 */
@Data
public class QuestionVO {
    private Integer questionId;
    private Integer categoryId;
    private String title;
    private Integer difficulty;
    private String examPoint;
    private Integer viewCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
