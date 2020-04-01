package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic_trace {

    private String topic_trace_id;

    private String topic_id;

    private String user_id;

    private String apply_date;

    private Integer flag;

    private String final_date;

    private String appraise;

    private String self_appraise;

}
