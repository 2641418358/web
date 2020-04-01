package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic_additional_files {

    private String topic_additional_files_id;

    private String topic_trace_id;

    private String links;

    private String upload_date;

    private Integer stage;

    private String description;

}
