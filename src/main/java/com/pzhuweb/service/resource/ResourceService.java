package com.pzhuweb.service.resource;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.ResourceDto;
import com.pzhuweb.entity.Resource_type;

import java.util.List;

public interface ResourceService {
    /**
     * 通过用户id查询资源
     * @param userid
     * @return
     */
    List<ApiResponse<ResourceDto>> getResourceByUserId(String userid);

    /**
     * 查询所有资源
     * @return
     */
    List<ApiResponse<ResourceDto>> getResource();

    /**
     * 查询所有资源分类
     * @return
     */
    List<ApiResponse<Resource_type>> getResourceType();
}
