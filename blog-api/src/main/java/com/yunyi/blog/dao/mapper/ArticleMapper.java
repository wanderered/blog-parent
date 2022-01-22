package com.yunyi.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunyi.blog.dao.dos.Archives;
import com.yunyi.blog.dao.pojo.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper extends BaseMapper<Article> {
    List<Archives> listArchives();
}
