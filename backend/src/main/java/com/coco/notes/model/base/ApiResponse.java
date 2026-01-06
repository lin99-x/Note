package com.coco.notes.model.base;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API response class
 * @param <T> response data type
 */
@Data
@NoArgsConstructor
public class ApiResponse<T> {
    private int code;
    private String message;
    private T data;

    /**
     * Constructor
     * @param code
     * @param message
     * @param data
     */
    public ApiResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * Successful response
     * @param data
     * @param <T> resposne data type
     * @return ApiResonse
     */
    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setCode(200);
        response.setMessage("success");
        response.setData(data);
        return response;
    }

    /**
     * Successful response(without data)
     * @return ApiResponse
     */
    public static ApiResponse<EmptyVO> success() {
        return success(new EmptyVO());
    }

    /**
     * Error response (without data)
     * @param code
     * @param message
     * @return ApiResponse
     */
    public static <T> ApiResponse<T> error(int code, String message) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    /**
     * Error response
     * @param code
     * @param message
     * @param data
     * @return ApiResponse
     */
    public static <T> ApiResponse<T> error(int code, String message, T data) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setCode(code);
        response.setMessage(message);
        response.setData(data);
        return response;
    }
}