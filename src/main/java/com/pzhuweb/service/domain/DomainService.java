package com.pzhuweb.service.domain;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.entity.Domain;

import java.util.List;

public interface DomainService {
    /**
     * 查询全部信息
     * @return
     */
    List<ApiResponse<Domain>> getDomainInfo();
}
