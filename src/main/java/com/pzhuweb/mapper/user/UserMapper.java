package com.pzhuweb.mapper.user;

import com.pzhuweb.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User getUserById(String id);
}
