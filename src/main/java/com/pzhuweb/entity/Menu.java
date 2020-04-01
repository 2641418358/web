package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    private Integer id;

    private String name;

    private Integer status;

    private String created_at;

    private String updated_at;

}
