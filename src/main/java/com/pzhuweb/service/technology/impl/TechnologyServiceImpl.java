package com.pzhuweb.service.technology.impl;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.entity.Technology;
import com.pzhuweb.mapper.technology.TechnologyMapper;
import com.pzhuweb.service.technology.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologyServiceImpl implements TechnologyService {

    @Autowired(required = false)
    private TechnologyMapper technologyMapper;

    @Override
    public List<ApiResponse<Technology>> getTechnology() {

        List<Technology> technologies = technologyMapper.getTechnology();

        List<ApiResponse<Technology>> lists = new ArrayList<>();

        if (technologies.size() <= 0){
            lists.add(new ApiResponse<>().success(0).data(null));
            return lists;
        }

        for (Technology t :
                technologies) {
            lists.add(new ApiResponse<>().success(1).data(t));
        }

        return lists;
    }
}
