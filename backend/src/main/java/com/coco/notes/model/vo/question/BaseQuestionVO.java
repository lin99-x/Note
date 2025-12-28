package com.coco.notes.model.vo.question;

import lombok.Data;

@Data
public class BaseQuestionVO {
    private Integer questionId;
    private Integer categoryId;
    private String title;
    private Integer difficulty;
    private String examPoint;
    private Integer viewCount;
}
