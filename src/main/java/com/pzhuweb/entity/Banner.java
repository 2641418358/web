package com.pzhuweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Banner {

    private Integer id;

    private String link;

    private String title;

    private String description;

    private Integer prior;

}
