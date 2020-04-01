package com.pzhuweb.mapper.school;

import com.pzhuweb.entity.School;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SchoolMapper {

    School getSchoolById(Integer id );
}
