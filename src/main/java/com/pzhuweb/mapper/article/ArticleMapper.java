package com.pzhuweb.mapper.article;

import com.pzhuweb.dto.ArticleDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleMapper {

    List<ArticleDto> getArticleByUserId(String userid);

    List<ArticleDto> getArticle();
}
