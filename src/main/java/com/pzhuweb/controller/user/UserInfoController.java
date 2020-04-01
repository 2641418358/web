package com.pzhuweb.controller.user;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.OtherInfoDto;
import com.pzhuweb.dto.UserInfoDto;
import com.pzhuweb.service.other.OtherInfoService;
import com.pzhuweb.service.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired(required = false)
    private UserInfoService userInfoService;

    @Autowired(required = false)
    private OtherInfoService otherInfoService;

    @RequestMapping("/getUserInfo/{id}")
    public ApiResponse<UserInfoDto> getUserInfo(@PathVariable("id")String id){

        ApiResponse<UserInfoDto> userInfo = userInfoService.getUserInfo(id);

        return userInfo;
    }

    @RequestMapping("/getOtherInfo/{id}")
    public ApiResponse<OtherInfoDto> getOtherInfo(@PathVariable("id")String id){

        ApiResponse<OtherInfoDto> otherInfo = otherInfoService.getOtherInfo(id);

        return otherInfo;
    }

}
