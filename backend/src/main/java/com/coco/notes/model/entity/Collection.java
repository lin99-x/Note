package com.coco.notes.model.entity;

import java.sql.Date;

import lombok.Data;

/**
 * @ClassName Collection
 * @Description Collection entity class
 */
@Data
public class Collection {
    // Collection ID
    private Integer collectionId;
    // Collection name
    private Integer name;
    // Collection description
    private Integer description;
    // Creator ID of this collecton
    private Long creatorId;
    // Created time
    private Date createdAt;
    // Updated time
    private Date updatedAt;
}
