package com.coco.notes.model.vo.message;

import lombok.Data;

/**
 * Count for different types of unread messages
 */
@Data
public class UnreadCountByType {
    // Message type
    private String type;
    // Unread count
    private Integer count;
}
