package com.gaoxvnan.blog.service;

import com.gaoxvnan.blog.vo.params.CommentParam;
import com.gaoxvnan.blog.vo.params.Result;

public interface CommentsService {
    /**
     * 根据文章id查询所有的评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    /**
     * 评论
     * @return
     */
    Result comment(CommentParam commentParam);
}
