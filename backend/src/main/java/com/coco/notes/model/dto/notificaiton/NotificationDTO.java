package com.coco.notes.model.dto.notificaiton;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NotificationDTO {
    @NotBlank(message = "Content cannot be empty")
    private String content;
}
