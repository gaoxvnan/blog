package com.gaoxvnan.blog.service;

import com.gaoxvnan.blog.vo.CategoryVo;
import com.gaoxvnan.blog.vo.params.Result;

public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
