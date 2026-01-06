package com.coco.notes.model.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TokenApiResponse<T> extends ApiResponse<T> {
    private final String token;

    public TokenApiResponse(int code, String message, T data, String token) {
        super(code, message, data);
        this.token = token;
    }
}
