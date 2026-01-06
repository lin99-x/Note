package com.coco.notes.model.enums.message;

import lombok.Getter;

@Getter
public enum MessageTargetType {
    NOTE(1, "Note"),
    COMMENT(2, "Comment");
    private final Integer type;
    private final String desc;

    MessageTargetType(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
