package com.pzhuweb.mapper.achievement;

import com.pzhuweb.dto.AchievementDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AchievementMapper {

    AchievementDto getAchievementByUserId(String userid);

    List<AchievementDto> getAchievement();
}
