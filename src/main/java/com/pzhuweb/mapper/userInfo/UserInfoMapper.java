package com.pzhuweb.mapper.userInfo;

import com.pzhuweb.dto.UserInfoDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserInfoMapper {


    /**
     * 根据id查询
     * @param id
     */
    UserInfoDto getUserInfo(String id);
}
