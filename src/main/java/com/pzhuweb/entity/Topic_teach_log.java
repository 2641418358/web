package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic_teach_log {

    private String topic_teach_log_id;

    private String teacher_id;

    private String teach_date;

    private String log;

    private String additional_files;

    private Integer flag;

    private String topic_trace_id;

    private String meet_id;

}
