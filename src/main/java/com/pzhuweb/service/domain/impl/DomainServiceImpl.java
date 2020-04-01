package com.pzhuweb.service.domain.impl;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.entity.Domain;
import com.pzhuweb.mapper.domain.DomainMapper;
import com.pzhuweb.service.domain.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomainServiceImpl implements DomainService {

    @Autowired(required = false)
    private DomainMapper domainMapper;

    @Override
    public List<ApiResponse<Domain>> getDomainInfo() {

        List<ApiResponse<Domain>> lists = new ArrayList<ApiResponse<Domain>>();

        List<Domain> domains = domainMapper.getDomainInfo();

        if (domains.size() <= 0){
            lists.add(new ApiResponse<>().success(0).data(null));
            return lists;
        }

        for (Domain domain :
                domains) {
            lists.add(new ApiResponse<>().success(1).data(domain));
        }

        return lists;
    }
}
