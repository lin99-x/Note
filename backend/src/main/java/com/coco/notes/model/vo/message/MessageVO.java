package com.coco.notes.model.vo.message;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MessageVO {
    private Integer messageId;
    // Sender information
    private Sender sender;
    // Message type
    private Integer type;
    // Target id
    private Target target;
    // Message content
    private String content;
    // If its read;
    private boolean isRead;
    // Message created time
    private LocalDateTime createdAt;

    // Simple user information
    @Data
    public static class Sender {
        private Long userId;
        private String userName;
        private String avatarUrl;
    }

    // Target information
    @Data
    public static class Target {
        private Integer targetId;
        private Integer targetType;
        private QuestionSummary questionSummary;
    }

    @Data
    public static class QuestionSummary {
        private Integer questionId;
        private String title;
    }
}
