package com.pzhuweb.mapper.technology;

import com.pzhuweb.entity.Technology;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TechnologyMapper {

    Technology getTechnologyById(Integer id);

    List<Technology> getTechnology();
}
