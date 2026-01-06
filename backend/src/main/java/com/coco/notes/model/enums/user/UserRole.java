package com.coco.notes.model.enums.user;

import lombok.Getter;

@Getter
public enum UserRole {
    NOT_ADMIN(0, "Not admin"),
    IS_ADMIN(1, "Is admin");
    private final Integer type;
    private final String desc;

    UserRole(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
