package com.coco.notes.model.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @ClassName Note
 * @Description Note entity class
 */
@Data
public class Note {
    // Note ID
    private Integer noteId;
    // Author ID
    private Long authorId;
    // Question ID
    private Integer questionId;
    // Note content
    private String content;
    // Like count;
    private Integer likeCount;
    // Comment count
    private Integer commentCount;
    // Collect count
    private Integer collectCount;
    // Created time
    private LocalDateTime createdAt;
    // Updated time
    private LocalDateTime updatedAt;
}
