package com.pzhuweb.controller.achievement;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.AchievementDto;
import com.pzhuweb.entity.Achievement;
import com.pzhuweb.entity.Achievement_type;
import com.pzhuweb.service.achievement.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/achievement")
public class AchievementController {

    @Autowired(required = false)
    private AchievementService achievementService;

    @RequestMapping("/getAchievementByUserId/{userid}")
    private ApiResponse<AchievementDto> getAchievementByUserId(@PathVariable("userid")String userid){

        ApiResponse<AchievementDto> achievementDtos = achievementService.getAchievementByUserId(userid);

        return achievementDtos;
    }

    @RequestMapping("/getAchievement")
    private List<ApiResponse<AchievementDto>> getAchievement(){

        List<ApiResponse<AchievementDto>> achevemnets = achievementService.getAchievement();

        return achevemnets;
    }

    @RequestMapping("/getAchievementType")
    private List<ApiResponse<Achievement_type>> getAchievementType(){

        List<ApiResponse<Achievement_type>> achievementTypes = achievementService.getAchievementType();

        return achievementTypes;
    }

}
