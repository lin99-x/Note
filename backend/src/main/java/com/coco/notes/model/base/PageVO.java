package com.coco.notes.model.base;

import java.util.List;

import lombok.Data;

@Data
public class PageVO<T> {
    // Current page number
    private Integer page;
    // Number of items per page
    private Integer pageSize;
    // Total number of records in DB
    private Integer total;
    // Total pages
    private Integer totalPages;
    // Actual data items on this page
    private List<T> list;

    public PageVO(Integer page, Integer pageSize, Integer total, List<T> list) {
        this.page = page;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
    }

    /**
     * Pagination
     * @param page
     * @param pageSize
     * @param total
     * @param list
     * @return Pagination result
     */
    public static <T> PageVO<T> of(Integer page, Integer pageSize, Integer total, List<T> list) {
        PageVO<T> pageVO = new PageVO<>(page, pageSize, total, list);
        pageVO.setTotalPages((total + pageSize - 1) / pageSize);
        return pageVO;
    }
}
