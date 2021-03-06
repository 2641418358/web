package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id;

    private String password;

    private String name;

    private String email;

    private Integer status;

    private String created_at;

    private String updated_at;
}
