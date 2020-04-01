package com.pzhuweb.controller.member;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.MemberInfoDto;
import com.pzhuweb.entity.Domain;
import com.pzhuweb.service.domain.DomainService;
import com.pzhuweb.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired(required = false)
    private MemberService memberService;

    @Autowired(required = false)
    private DomainService domainService;

    @RequestMapping("/getMemberInfo")
    public List<ApiResponse<MemberInfoDto>> getMemberInfo(){

        List<ApiResponse<MemberInfoDto>> members = memberService.getMemberInfo();

        return members;
    }

    @RequestMapping("/getDomainInfo")
    public List<ApiResponse<Domain>> getDomainInfo(){

        List<ApiResponse<Domain>> domains = domainService.getDomainInfo();

        return domains;
    }

}
