package com.pzhuweb.service.article;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.ArticleDto;

import java.util.List;

public interface ArticleService {
    /**
     * 更具用户名查询用户相关文章
     * @param userid
     * @return
     */
    List<ApiResponse<ArticleDto>> getArticleByUserId(String userid);

    /**
     * 查询所有文章
     * @return
     */
    List<ApiResponse<ArticleDto>> getArticle();
}
