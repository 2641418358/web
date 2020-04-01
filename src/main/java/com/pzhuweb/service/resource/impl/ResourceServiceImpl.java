package com.pzhuweb.service.resource.impl;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.ResourceDto;
import com.pzhuweb.entity.Resource_type;
import com.pzhuweb.mapper.resource.ResourceMapper;
import com.pzhuweb.mapper.resource_type.ResourceTypeMapper;
import com.pzhuweb.service.resource.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired(required = false)
    private ResourceMapper resourceMapper;
    @Autowired(required = false)
    private ResourceTypeMapper resourceTypeMapper;

    @Override
    public List<ApiResponse<ResourceDto>> getResourceByUserId(String userid) {

        List<ResourceDto> resourceDtos = resourceMapper.getResourceByUserId(userid);

        List<ApiResponse<ResourceDto>> lists = new ArrayList<>();
        
        if (resourceDtos.size() <= 0){
            lists.add(new ApiResponse<>().success(0).data(null));
            return lists;
        }

        for (ResourceDto resource :
                resourceDtos) {
            lists.add(new ApiResponse<>().success(1).data(resource));
        }

        return lists;
    }

    @Override
    public List<ApiResponse<ResourceDto>> getResource() {

        List<ResourceDto> resourceDtos = resourceMapper.getResource();

        List<ApiResponse<ResourceDto>> lists = new ArrayList<>();

        if (resourceDtos.size() <= 0){
            lists.add(new ApiResponse<>().success(0).data(null));
            return lists;
        }

        for (ResourceDto resource :
                resourceDtos) {
            lists.add(new ApiResponse<>().success(1).data(resource));
        }

        return lists;
    }

    @Override
    public List<ApiResponse<Resource_type>> getResourceType() {


        List<Resource_type> resourceTypes = resourceTypeMapper.getResourceType();

        List<ApiResponse<Resource_type>> lists = new ArrayList<>();

        if (resourceTypes.size() <= 0){
            lists.add(new ApiResponse<>().success(0).data(null));
            return lists;
        }

        for (Resource_type resourceType :
                resourceTypes) {
            lists.add(new ApiResponse<>().success(1).data(resourceType));
        }

        return lists;
    }
}
