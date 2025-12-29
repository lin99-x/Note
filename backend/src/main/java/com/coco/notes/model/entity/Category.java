package com.coco.notes.model.entity;

import java.sql.Date;

import lombok.Data;

/**
 * @ClassName Category
 * @Description Category entity class
 */
@Data
public class Category {
    // Category ID
    private Integer categoryId;
    // Category name
    private String name;
    // Parent category ID, if it's 0 means its root
    private Integer parentCategoryId;
    // Created time
    private Date createdAt;
    // Updated time
    private Date updatedAt;
}
