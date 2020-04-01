package com.pzhuweb.mapper.otherInfo;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.OtherInfoDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface OtherInfoMapper {

    Map<String,Integer> getOtherArtic(String id);

    Integer getOtherAchevement(String id);

    Integer getOtherResource(String id);

    Integer getOtherFavorite(String id);
}
