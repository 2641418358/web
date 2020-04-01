package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meet {

    private String meet_id;

    private String created_date;

    private String start_date;

    private String end_date;

    private String address;

    private Integer send_flag;

    private String user_id;

    private String content;

    private String log_writer;

    private String title;
}
