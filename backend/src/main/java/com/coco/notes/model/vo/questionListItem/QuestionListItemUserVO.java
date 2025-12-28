package com.coco.notes.model.vo.questionListItem;

import com.coco.notes.model.vo.question.BaseQuestionVO;

import lombok.Data;

@Data
public class QuestionListItemUserVO {
    private Integer questionListId;
    private BaseQuestionVO question;
    private UserQuestionStatus userQuestionStatus;
    private Integer rank;

    @Data
    public static class UserQuestionStatus {
        private Boolean isFinished;
    }
}
