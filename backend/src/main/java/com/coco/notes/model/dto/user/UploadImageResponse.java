package com.coco.notes.model.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* Upload image response DTO*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UploadImageResponse {
    // Status code
    private Integer status;

    // Message
    private String msg;

    // Response data
    private UploadImageResponseData data;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UploadImageResponseData {
        // Image URL
        private String url;
    }
}
