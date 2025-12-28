package com.coco.notes.model.vo.note;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class NoteVO {
    private Integer noteId;
    private SimpleAuthorVO author;
    private UserActionsVO userActions;
    private SimpleQuestionVO question;
    private String content;
    private Boolean needCollapsed;
    private String displayContent;
    private Integer likeCount;
    private Integer commentCount;
    private Integer collectCount;
    private LocalDateTime createdAt;

    @Data
    public static class SimpleAuthorVO {
        private Long userId;
        private String userName;
        private String avatarUrl;
    }

    @Data
    public static class UserActionsVO {
        private Boolean isLiked;
        private Boolean isCollected;
    }

    @Data
    public static class SimpleQuestionVO {
        private Integer questionId;
        private String title;
    }
}
