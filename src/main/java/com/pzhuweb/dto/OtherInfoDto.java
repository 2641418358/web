package com.pzhuweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OtherInfoDto {

    //个人文章数
    private Integer articleNum;

    //个人全部文章的总阅读数
    private Integer readNum;

    //个人成果数
    private Integer achievementNum;

    //个人资源数
    private Integer resourceNum;

    //个人收藏数
    private Integer favoriteNum;

}
