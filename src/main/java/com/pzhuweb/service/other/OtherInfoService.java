package com.pzhuweb.service.other;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.OtherInfoDto;

public interface OtherInfoService {


    /**
     * 根据id获取账户其他信息
     * @param id
     * @return
     */
    ApiResponse<OtherInfoDto> getOtherInfo(String id);
}
