package com.coco.notes.model.entity;

import java.sql.Date;

import lombok.Data;

/**
 * @ClassName CollectionNote
 * @Description Collection-Note related entity class
 */
@Data
public class CollectionNote {
    // Collection ID (composite primary key)
    private Integer collectionId;
    // Note ID (composite primary key)
    private Integer noteId;
    // Created time
    private Date createdAt;
    // Updated time
    private Date updatedAt;
}
