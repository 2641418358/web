package com.pzhuweb.mapper.domain;

import com.pzhuweb.entity.Domain;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DomainMapper {

    Domain getDomainById(Integer id);

    List<Domain> getDomainInfo();
}
