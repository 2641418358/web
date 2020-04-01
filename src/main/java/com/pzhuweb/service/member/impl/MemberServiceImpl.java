package com.pzhuweb.service.member.impl;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.MemberInfoDto;
import com.pzhuweb.mapper.member.MemberMapper;
import com.pzhuweb.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired(required = false)
    private MemberMapper memberMapper;

    @Override
    public List<ApiResponse<MemberInfoDto>> getMemberInfo() {

        List<MemberInfoDto> memberInfos = memberMapper.getMemberInfo();

        List<ApiResponse<MemberInfoDto>> lists = new ArrayList<>();

        if (memberInfos.size() <= 0){
            lists.add(new ApiResponse<>().success(0).data(null));
            return lists;
        }

        for (MemberInfoDto memberInfo : memberInfos) {
            memberInfo.get_user().setPassword("");
            ApiResponse data = new ApiResponse<>().success(1).data(memberInfo);
            lists.add(data);
        }

        return lists;
    }
}
