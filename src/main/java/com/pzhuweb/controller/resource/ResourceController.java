package com.pzhuweb.controller.resource;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.ResourceDto;
import com.pzhuweb.entity.Resource_type;
import com.pzhuweb.service.resource.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired(required = false)
    private ResourceService resourceService;

    @RequestMapping("/getResourceByUserId/{userid}")
    private List<ApiResponse<ResourceDto>> getResourceByUserId(@PathVariable("userid")String userid){

        List<ApiResponse<ResourceDto>> resourceDto = resourceService.getResourceByUserId(userid);

        return resourceDto;
    }

    @RequestMapping("/getResource")
    private List<ApiResponse<ResourceDto>> getResource(){

        List<ApiResponse<ResourceDto>> resourceDto = resourceService.getResource();

        return resourceDto;
    }

    @RequestMapping("/getResourceType")
    private List<ApiResponse<Resource_type>> getResourceType(){

        List<ApiResponse<Resource_type>> resourceTypes = resourceService.getResourceType();

        return resourceTypes;
    }

}
