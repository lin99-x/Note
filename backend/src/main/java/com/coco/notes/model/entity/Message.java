package com.coco.notes.model.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @ClassName Message
 * @Description Message entity class
 */
@Data
public class Message {
    // Message ID
    private Integer messageId;
    // Receiver ID
    private Long receiverId;
    // Sender ID
    private Long senderId;
    // Message type
    private Integer type;
    // Target ID
    private Integer targetId;
    // Target type
    private Integer targetType;
    // Message content
    private String content;
    // If the message is read
    private Boolean isRead;
    // Created time
    private LocalDateTime createdAt;
    // Updated time
    private LocalDateTime updatedAt;
}
