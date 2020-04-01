package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User_info {

    private String id;

    private Integer school;

    private Integer major;

    private Integer domain;

    private String avatar;

    private String phone;

    private String description;

    private String created_at;

    private String updated_at;

}
