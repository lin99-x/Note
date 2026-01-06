package com.coco.notes.model.enums.user;

import lombok.Getter;

@Getter
public enum UserBanned {
    NOT_BANNED(0, "Normal"),
    IS_BANNED(1, "BANNED");
    private final Integer type;
    private final String desc;

    UserBanned(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
