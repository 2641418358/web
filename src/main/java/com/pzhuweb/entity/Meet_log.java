package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meet_log {

    private String meet_log_id;

    private String meet_id;

    private String content;

    private String additional;

    private String title;

    private String created_date;

    private String modify_date;

}
