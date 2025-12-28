package com.coco.notes.model.vo.note;

import lombok.Data;

@Data
public class NoteRankListItem {
    private String userName;
    private Long userId;
    private String avatarUrl;
    private Integer rank;
    private Integer noteCount;

}
