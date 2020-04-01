package com.pzhuweb.dto;

import com.pzhuweb.entity.Menu;
import com.pzhuweb.entity.Technology;
import com.pzhuweb.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {

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

    private User user;

    private Menu menu;

    private Technology technology;

}
