package com.pzhuweb.service.achievement.impl;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.AchievementDto;
import com.pzhuweb.entity.Achievement_type;
import com.pzhuweb.mapper.achievement.AchievementMapper;
import com.pzhuweb.mapper.achievement_type.AchievementTypeMapper;
import com.pzhuweb.service.achievement.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AchievementServiceImpl implements AchievementService {

    @Autowired(required = false)
    private AchievementMapper achievementMapper;

    @Autowired(required = false)
    private AchievementTypeMapper achievementTypeMapper;


    @Override
    public ApiResponse<AchievementDto> getAchievementByUserId(String userid) {

        AchievementDto achievementDto = achievementMapper.getAchievementByUserId(userid);

        if (achievementDto == null){
            return new ApiResponse<>().success(0).data(null);
        }

        return new ApiResponse<>().success(1).data(achievementDto);
    }

    @Override
    public List<ApiResponse<AchievementDto>> getAchievement() {

        List<AchievementDto> achievementDtos = achievementMapper.getAchievement();

        List<ApiResponse<AchievementDto>> lists = new ArrayList<>();

        if (achievementDtos.size() <= 0){
            lists.add(new ApiResponse<>().success(0).data(null));
            return lists;
        }

        for (AchievementDto acdto :
                achievementDtos) {
            lists.add(new ApiResponse<>().success(1).data(acdto));
        }

        return lists;
    }

    @Override
    public List<ApiResponse<Achievement_type>> getAchievementType() {

        List<Achievement_type> types = achievementTypeMapper.getAchievementTypeInfo();

        List<ApiResponse<Achievement_type>> lists = new ArrayList<>();

        if (types.size() <= 0){
            lists.add(new ApiResponse<>().success(0).data(null));
            return lists;
        }

        for (Achievement_type type :
                types) {
            lists.add(new ApiResponse<>().success(1).data(type));
        }

        return lists;
    }
}
