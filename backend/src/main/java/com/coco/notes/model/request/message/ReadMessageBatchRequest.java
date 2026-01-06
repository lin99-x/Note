package com.coco.notes.model.request.message;

import java.util.List;
import lombok.Data;

@Data
public class ReadMessageBatchRequest {
    private List<Integer> messageIds;
}
