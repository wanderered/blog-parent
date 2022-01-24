package com.yunyi.blog.service;

import com.yunyi.blog.vo.CategoryVo;
import com.yunyi.blog.vo.Result;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();
}
