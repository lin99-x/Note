package com.coco.notes.model.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @ClassName NoteLike
 * @Description Note-Like related entity class
 */
@Data
public class NoteLike {
    // Note ID (composite primary key)
    private Integer noteId;
    // User ID (who liked this note, composite primary key)
    private Long userId;
    // Created time
    private LocalDateTime createdAt;
    // Updated time
    private LocalDateTime updatedAt;
}
