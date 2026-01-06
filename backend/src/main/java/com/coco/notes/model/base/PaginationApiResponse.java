package com.coco.notes.model.base;

public class PaginationApiResponse<T> extends ApiResponse<T> {
    private final Pagination pagination;

    /**
     * Constructor
     */
    public PaginationApiResponse(int code, String message, T data, Pagination pagination) {
        super(code, message, data);
        this.pagination = pagination;
    }

    /**
     * Provide read access to the pagination info
     * @return pagination
     */
    public Pagination gePagination() {
        return pagination;
    }
}
