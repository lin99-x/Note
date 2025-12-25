package com.coco.notes.model.dto.statistic;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StatisticQueryParam {
    @NotNull(message = "Page cannot be empty")
    @Min(value = 1, message = "Page must be positive integer")
    private Integer page;

    @NotNull(message = "Page size cannot be empty")
    @Min(value = 1, message = "Page size must be positive integer")
    private Integer pageSize;
}
