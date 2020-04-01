package com.pzhuweb.dto;

import com.pzhuweb.entity.Resource_type;
import com.pzhuweb.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceDto {

    private Integer id;

    private String userid;

    private Integer typeid;

    private String title;

    private String description;

    private String posterlink;

    private String link;

    private String attachment;

    private Integer status;

    private String created_at;

    private String updated_at;

    private User user;

    private Resource_type resourceType;

}
