package com.gaoxvnan.blog.service;

import com.gaoxvnan.blog.vo.params.ArticleParam;
import com.gaoxvnan.blog.vo.params.PageParams;
import com.gaoxvnan.blog.vo.params.Result;

public interface ArticleService {
    /**
     * 分页查询 文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);

    /**
     * 首页最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    /**
     * 首页最新文章
     * @param limit
     * @return
     */
    Result newArticle(int limit);

    /**
     * 首页文章归档
     */
    Result listArchives();

    /**
     * 查看文章详情
     * @param articleId
     * @return
     */
    Result findArticleById(Long articleId);

    /**
     * 发布文章
     * @param articleParam
     * @return
     */
    Result publish(ArticleParam articleParam);
}
