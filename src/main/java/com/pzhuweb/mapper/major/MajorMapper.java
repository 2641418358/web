package com.pzhuweb.mapper.major;

import com.pzhuweb.entity.Major;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MajorMapper {

    Major getMajorById(Integer id);
}
