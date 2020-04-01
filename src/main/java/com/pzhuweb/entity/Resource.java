package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resource {

    private Integer id;

    private String userid;

    private Integer typeid;

    private String title;

    private String description;

    private String posterlink;

    private String link;

    private String attachment;

    private Integer status;

    private String created_at;

    private String updated_at;

}
