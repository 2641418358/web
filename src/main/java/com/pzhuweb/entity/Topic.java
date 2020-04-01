package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {

    private String topic_id;

    private String topic_name;

    private String created_data;

    private String description;

    private Integer flag;

    private String origin;

    private Date modify_data;

}
