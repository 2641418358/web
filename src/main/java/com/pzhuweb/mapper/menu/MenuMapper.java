package com.pzhuweb.mapper.menu;

import com.pzhuweb.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MenuMapper {

    Menu getMenuById(Integer id);

}
