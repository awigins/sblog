package edu.ustb.blog.dao;

import edu.ustb.blog.entity.Article;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

public interface ArticleMapper {

    @Select("Select * from article order by desc limit 0,10")
    ArrayList<Article> selectHotArticle();
}
