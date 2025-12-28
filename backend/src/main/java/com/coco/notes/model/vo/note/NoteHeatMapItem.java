package com.coco.notes.model.vo.note;

import java.time.LocalDate;

import lombok.Data;

@Data
public class NoteHeatMapItem {
    private LocalDate date;
    private Integer count;
    private Integer rank;
}
