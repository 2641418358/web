package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Favorite {

    private Integer id;

    private String userid;

    private Integer articleid;

    private String created_at;

    private String updated_at;

}
