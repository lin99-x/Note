package com.coco.notes.model.enums.message;

import lombok.Getter;

@Getter
public enum MessageType {
    LIKE(1, "Like"),
    COMMENT(2, "Comment"),
    SYSTEM(3, "System");
    private final Integer type;
    private final String desc;

    MessageType(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
