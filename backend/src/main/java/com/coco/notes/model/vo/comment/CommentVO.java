package com.coco.notes.model.vo.comment;

import java.time.LocalDateTime;
import java.util.List;

import com.coco.notes.model.vo.user.UserActionVO;
import lombok.Data;

@Data
public class CommentVO {
    private Integer commentId;
    private Integer noteId;
    private String content;
    private Integer likeCount;
    private Integer replyCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private SimpleAuthorVO author;
    private UserActionVO userActions;
    private List<CommentVO> replies;

    @Data
    public static class SimpleAuthorVO {
        private Long userId;
        private String userName;
        private String avatarUrl;
    }
}
