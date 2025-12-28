package com.coco.notes.model.vo.question;

import lombok.Data;

/**
 * Query detailed information for a single question based on questionId
 */
@Data
public class QuestionNoteVO {
    private Integer questionId;
    private String title;
    private Integer difficulty;
    private String examPoint;
    private Integer viewCount;
    private UserNote userNote;

    @Data
    public static class UserNote {
        private Boolean isFinished;
        private Integer noteId;
        private String content;
    }
}
