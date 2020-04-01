package com.pzhuweb.mapper.resource_type;

import com.pzhuweb.entity.Resource_type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResourceTypeMapper {

    Resource_type getResourceTypeById(Integer id);

    List<Resource_type> getResourceType();

}
