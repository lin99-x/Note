package com.coco.notes.model.dto.message;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class MessageQueryParams {
    // Message type
    private String type;

    // If its read
    private Boolean isRead;

    // Start time
    private LocalDateTime startTime;

    // End time
    private LocalDateTime endTime;

    // Current page, start from 1
    @Min(value = 1, message = "Page must be positive integer")
    private Integer page;

    // Page size
    @Min(value = 1, message = "Page size must be positive integer")
    private Integer pageSize;

    // Sort method, default is created time
    private String sortField = "created_at";

    // Sort direction, default is desc
    private String sortOrder = "desc";
}
