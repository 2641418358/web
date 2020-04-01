package com.pzhuweb.dto;

import com.pzhuweb.entity.Achievement_type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AchievementDto {

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

    private Achievement_type AchievementType;
}
