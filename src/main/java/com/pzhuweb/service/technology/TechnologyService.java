package com.pzhuweb.service.technology;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.entity.Technology;

import java.util.List;

public interface TechnologyService {

    /**
     * 返回科目条例
     * @return
     */
    List<ApiResponse<Technology>> getTechnology();
}
