package com.coco.notes.model.entity;

import java.time.LocalDate;

import lombok.Data;

/**
 * @ClassName Statistic
 * @Description Statistic entity class, include data for login, registration, note, etc.
 */
@Data
public class Statistic {
    // Primary key ID
    private Integer id;
    // Log in count for one day
    private Integer loginCount;
    // Register count for one day
    private Integer registerCount;
    // Totle register number
    private Integer totalRegisterCount;
    // Totle notes number for one day
    private Integer noteCount;
    // Totle submitted notes number for one day
    private Integer submitNoteCount;
    // Total notes
    private Integer totalNoteCount;
    // Current day
    private LocalDate date;
}
