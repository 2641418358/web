package com.pzhuweb.service.article.impl;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.ArticleDto;
import com.pzhuweb.mapper.article.ArticleMapper;
import com.pzhuweb.service.article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired(required = false)
    private ArticleMapper articleMapper;

    @Override
    public List<ApiResponse<ArticleDto>> getArticleByUserId(String userid) {

        List<ArticleDto> articleDtos = articleMapper.getArticleByUserId(userid);

        List<ApiResponse<ArticleDto>> lists = new ArrayList<>();

        if (articleDtos.size() <= 0){
            lists.add(new ApiResponse<>().success(0).data(null));
            return lists;
        }

        for (ArticleDto article :
                articleDtos) {
            lists.add(new ApiResponse<>().success(1).data(article));
        }

        return lists;
    }

    @Override
    public List<ApiResponse<ArticleDto>> getArticle() {

        List<ArticleDto> articleDtos = articleMapper.getArticle();

        List<ApiResponse<ArticleDto>> lists = new ArrayList<>();

        if (articleDtos.size() <= 0){
            lists.add(new ApiResponse<>().success(0).data(null));
            return lists;
        }

        for (ArticleDto article :
                articleDtos) {
            lists.add(new ApiResponse<>().success(1).data(article));
        }

        return lists;
    }
}
