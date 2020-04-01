package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Announcement {

    private Integer id;

    private String title;

    private String _abstract;

    private String posterlink;

    private String context;

    private String time;

    private Integer readnumber;

    private Integer status;

    private Integer top;

}
