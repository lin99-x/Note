package com.coco.notes.model.enums.user;

import lombok.Getter;

@Getter
public enum UserGender {
    MALE(1, "Male"),
    FEMALE(2, "Female"),
    SECRET(3, "Secret");
    private final Integer type;
    private final String desc;

    UserGender(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
