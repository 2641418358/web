package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Media {

    private Integer id;

    private String userid;

    private Integer articleid;

    private String link;

    private String key;

    private Integer status;

}
