package com.coco.notes.model.base;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pagination {
    // Current page number
    private Integer page;
    // Number of items per page
    private Integer pageSize;
    // Total number of records in DB
    private Integer total;
}
