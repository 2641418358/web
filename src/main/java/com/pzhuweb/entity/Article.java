package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    private Integer id;

    private String userid;

    private String title;

    private Integer menuid;

    private Integer technologyid;

    private String _abstract;

    private String keywords;

    private String postlink;

    private String raw;

    private String context;

    private Integer readnumber;

    private Integer status;

    private Integer top;

    private String created_at;

    private String updated_at;

}
