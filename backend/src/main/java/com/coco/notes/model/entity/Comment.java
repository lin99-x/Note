package com.coco.notes.model.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @ClassName Comment
 * @Description Comment entity class
 */
@Data
public class Comment {
    // Comment ID
    private Integer commentId;
    // Note ID
    private Integer noteId;
    // Author ID
    private Long authorId;
    // Parent comment ID
    private Integer parentId;
    // Comment content
    private String content;
    // Like count
    private Integer likeCount;
    // Reply count
    private Integer replyCount;
    // Created time
    private LocalDateTime createdAt;
    // Updated time
    private LocalDateTime updatedAt;
}
