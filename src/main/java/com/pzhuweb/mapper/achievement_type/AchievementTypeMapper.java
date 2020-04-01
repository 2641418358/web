package com.pzhuweb.mapper.achievement_type;

import com.pzhuweb.entity.Achievement_type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AchievementTypeMapper {

    Achievement_type getAchievementType();

    List<Achievement_type> getAchievementTypeInfo();
}
