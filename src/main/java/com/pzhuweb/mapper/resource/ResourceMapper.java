package com.pzhuweb.mapper.resource;

import com.pzhuweb.dto.ResourceDto;
import com.pzhuweb.entity.Resource_type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResourceMapper {

    List<ResourceDto> getResourceByUserId(String userid);

    List<ResourceDto> getResource();

}
