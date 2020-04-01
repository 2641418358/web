package com.pzhuweb.dto;

import com.pzhuweb.entity.Domain;
import com.pzhuweb.entity.Major;
import com.pzhuweb.entity.School;
import com.pzhuweb.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberInfoDto {

    private String id;

    private Integer school;

    private Integer major;

    private Integer domain;

    private String avatar;

    private String phone;

    private String description;

    private String created_at;

    private String updated_at;

    //一对一
    private School _school;

    private Major _major;

    private Domain _domain;

    private User _user;

}
