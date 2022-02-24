package com.gaoxvnan.blog.controller;

import com.gaoxvnan.blog.common.aop.LogAnnotation;
import com.gaoxvnan.blog.common.cache.Cache;
import com.gaoxvnan.blog.service.ArticleService;
import com.gaoxvnan.blog.vo.params.ArticleParam;
import com.gaoxvnan.blog.vo.params.PageParams;
import com.gaoxvnan.blog.vo.params.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//json数据进行交互
@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 首页 文章列表
     * @param pageParams
     * @return
     */
    @PostMapping
    //加上这个注解代表对此接口记录日志
    @LogAnnotation(module="文章",operator="获取文章列表")
    @Cache(expire = 5 * 60 *1000,name = "listArticle")
    public Result listArticle(@RequestBody PageParams pageParams){
        return articleService.listArticle(pageParams);
    }

    /**
     * 首页最热文章
     * @return
     */
    @PostMapping("hot")
    @Cache(expire = 5 * 60 *1000,name = "hot_article")
    public Result hotArticles(){
        int limit = 5;
        return articleService.hotArticle(limit);
    }

    /**
     * 首页最新文章
     */
    @PostMapping("new")
    @Cache(expire = 5 * 60 *1000,name = "new_article")
    public Result newArticles(){
        int limit = 5;
        return articleService.newArticle(limit);
    }

    /**
     * 首页文章归档
     */
    @PostMapping("listArchives")
    public Result listArchives(){
        return articleService.listArchives();
    }

    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId){
        return articleService.findArticleById(articleId);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam){
        return articleService.publish(articleParam);
    }
}
