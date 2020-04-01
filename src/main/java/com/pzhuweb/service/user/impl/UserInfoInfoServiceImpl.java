package com.pzhuweb.service.user.impl;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.UserInfoDto;
import com.pzhuweb.mapper.userInfo.UserInfoMapper;
import com.pzhuweb.service.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoInfoServiceImpl implements UserInfoService {

    @Autowired(required = false)
    private UserInfoMapper userInfoMapper;

    @Override
    public ApiResponse<UserInfoDto> getUserInfo(String id) {

        UserInfoDto userInfo = userInfoMapper.getUserInfo(id);

        if (userInfo == null){

            return new ApiResponse<>().success(0).data(null);
        }



        return new ApiResponse<>().success(1).data(userInfo);
    }
}
