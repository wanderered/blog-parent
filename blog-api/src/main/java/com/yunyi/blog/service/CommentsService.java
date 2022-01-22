package com.yunyi.blog.service;

import com.yunyi.blog.vo.Result;
import com.yunyi.blog.vo.params.CommentParam;

public interface CommentsService {
    /**
     * 根据文章ID查询所有的评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);


    Result comment(CommentParam commentParam);
}
