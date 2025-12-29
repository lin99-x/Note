package com.coco.notes.model.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @ClassName CommentLike
 * @Description Comment-Like related entity class
 */
@Data
public class CommentLike {
    // Comment like ID
    private Integer commentLikeId;
    // Comment ID
    private Integer commentId;
    // User ID
    private Long userId;
    // Created time
    private LocalDateTime createdAt;
}
