package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    private Integer id;

    private String content;

    private Integer user_id;

    private Integer article_id;

    private Integer fathercomment_id;

    private String updated_at;

    private String created_at;

    private Integer status;

}
