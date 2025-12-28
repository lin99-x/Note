package com.coco.notes.model.vo.questionListItem;

import com.coco.notes.model.vo.question.BaseQuestionVO;

import lombok.Data;

@Data
public class QuestionListItemVO {
    private Integer questionListId;
    private BaseQuestionVO question;
    private Integer rank;
}
