package com.pzhuweb.service.member;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.MemberInfoDto;

import java.util.List;

public interface MemberService {

    /**
     * 根据查询全部用户信息
     * @return
     */
    List<ApiResponse<MemberInfoDto>> getMemberInfo();
}
