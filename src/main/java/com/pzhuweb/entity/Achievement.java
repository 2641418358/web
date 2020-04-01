package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Achievement {

    private Integer id;

    private String userid;

    private String title;

    private Integer typeid;

    private String _abstract;

    private String posterlink;

    private String achievementlink;

    private String attachment;

    private Integer status;

    private String updated_at;

    private String created_at;

    private Integer show;
}
