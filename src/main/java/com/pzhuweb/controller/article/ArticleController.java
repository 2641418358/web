package com.pzhuweb.controller.article;

import com.pzhuweb.common.ApiResponse;
import com.pzhuweb.dto.ArticleDto;
import com.pzhuweb.entity.Article;
import com.pzhuweb.entity.Technology;
import com.pzhuweb.service.article.ArticleService;
import com.pzhuweb.service.technology.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired(required = false)
    private ArticleService articleService;

    @Autowired(required = false)
    private TechnologyService technologyService;


    @RequestMapping("/getArticleByUserId/{userid}")
    private List<ApiResponse<ArticleDto>> getArticleByUserId(@PathVariable("userid")String userid){

        List<ApiResponse<ArticleDto>> articleDtos = articleService.getArticleByUserId(userid);

        return articleDtos;
    }

    @RequestMapping("/getArticle")
    private List<ApiResponse<ArticleDto>> getArticle(){

        List<ApiResponse<ArticleDto>> articleDtos = articleService.getArticle();

        return articleDtos;
    }

    @RequestMapping("/getTechnology")
    private List<ApiResponse<Technology>> getTechnology(){

        List<ApiResponse<Technology>> technologys = technologyService.getTechnology();

        return technologys;
    }
}
