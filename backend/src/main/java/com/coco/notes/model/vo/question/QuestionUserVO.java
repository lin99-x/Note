package com.coco.notes.model.vo.question;

import lombok.Data;

/**
 * For normal user check questions that include personal information
 */
@Data
public class QuestionUserVO {
    private Integer questionId;
    private String title;
    private Integer difficulty;
    private String examPoint;
    private Integer viewCount;
    private UserQuestionStatus userQuestionStatus;

    @Data
    public static class UserQuestionStatus {
        // If this user finished this question
        private Boolean isFinished;
    }
}
