package com.pzhuweb.service.other.impl;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.OtherInfoDto;
import com.pzhuweb.mapper.otherInfo.OtherInfoMapper;
import com.pzhuweb.service.other.OtherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OtherInfoServiceImpl implements OtherInfoService {

    @Autowired(required = false)
    private OtherInfoMapper otherInfoMapper;

    @Override
    public ApiResponse<OtherInfoDto> getOtherInfo(String id) {

        Map<String,Integer> map = otherInfoMapper.getOtherArtic(id);

        Integer otherAchevement = otherInfoMapper.getOtherAchevement(id);

        Integer otherResource = otherInfoMapper.getOtherResource(id);

        Integer otherFavorite = otherInfoMapper.getOtherFavorite(id);

        if (map == null ){
            return new ApiResponse<>().success(0).data(null);
        }

        Number articleNum = (Number) map.get("articleNum");

        Number readNum = (Number)map.get("readNum");

        OtherInfoDto otherInfoDto = new OtherInfoDto(articleNum.intValue(), readNum.intValue(), otherAchevement, otherResource, otherFavorite);

        return new ApiResponse<>().success(1).data(otherInfoDto);
    }
}
