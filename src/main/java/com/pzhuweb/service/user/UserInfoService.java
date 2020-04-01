package com.pzhuweb.service.user;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.UserInfoDto;

public interface UserInfoService {
    /**
     * 根据id查询账户基本信息
     * @param id
     * @return
     */
    ApiResponse<UserInfoDto> getUserInfo(String id);
}
