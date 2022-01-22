package com.yunyi.blog.service;

import com.yunyi.blog.vo.CategoryVo;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);
}
