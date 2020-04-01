package com.pzhuweb.service.achievement;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.AchievementDto;
import com.pzhuweb.entity.Achievement_type;

import java.util.List;

public interface AchievementService {
    /**
     * 根据用户id查询成就信息
     * @param userid
     * @return
     */
    ApiResponse<AchievementDto> getAchievementByUserId(String userid);

    /**
     * 查询所有成果
     * @return
     */
    List<ApiResponse<AchievementDto>> getAchievement();

    /**
     * 查询所有成果分类情况
     * @return
     */
    List<ApiResponse<Achievement_type>> getAchievementType();
}
