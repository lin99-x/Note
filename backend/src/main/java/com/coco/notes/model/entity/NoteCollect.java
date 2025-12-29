package com.coco.notes.model.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @ClassName NoteCollect
 * @Description Note-Collect related entity class
 */
@Data
public class NoteCollect {
    // Note ID
    private Integer noteId;
    // Collection ID
    private Integer collectId;
    // User ID
    private Long userId;
    // Created time
    private LocalDateTime createdAt;
}
