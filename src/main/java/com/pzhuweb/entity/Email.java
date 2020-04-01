package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    private String email_id;

    private String meet_id;

    private String content;

    private String title;

    private String modify_date;

    private Integer flag;

    private String created_date;

}
