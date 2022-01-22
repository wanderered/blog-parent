package com.yunyi.blog.service;

import com.yunyi.blog.vo.Result;
import com.yunyi.blog.vo.TagVo;

import java.util.List;

public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);
}
