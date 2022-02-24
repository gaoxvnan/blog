package com.gaoxvnan.blog.service;

import com.gaoxvnan.blog.vo.TagVo;
import com.gaoxvnan.blog.vo.params.Result;

import java.util.List;

public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    Result findAll();

    Result findAllDetail();

    Result findDetailById(Long id);
}
