package com.coco.notes.model.dto.question;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class QuestionQueryParam {
    @Min(value = 1, message = "Category Id must be positive integer")
    private Integer categoryId;

    @Pattern(regexp = "^(view|difficulty)$", message = "Sort must be view or difficulty")
    private String sort;

    @Pattern(regexp = "^(asc|desc)$", message = "Order must be asc or desc")
    private String order;

    @NotNull(message = "Page cannot be empty")
    @Min(value = 1, message = "Page must be positive integer")
    private Integer page;

    @NotNull(message = "Page size cannot be empty")
    @Min(value = 1, message = "Pagesize must be positive integer")
    @Max(value = 200, message = "Pagesize cannot be larger than 200")
    private Integer pageSize;
}
