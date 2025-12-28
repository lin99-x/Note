package com.coco.notes.model.vo.collection;

import lombok.Data;

@Data
public class CollectionVO {
    private Integer collectionId;
    private String name;
    private String description;

    // If there is noteId in params, then we can use noteStatus to check if this note is collected
    private NoteStatus noteStatus;

    @Data
    public static class NoteStatus {
        private Integer noteId;
        private Boolean isCollected;
    }
}
