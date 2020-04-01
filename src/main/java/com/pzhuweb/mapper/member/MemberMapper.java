package com.pzhuweb.mapper.member;

import com.pzhuweb.dto.MemberInfoDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface MemberMapper {

    List<MemberInfoDto> getMemberInfo();
}
