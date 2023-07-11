package edu.ustb.blog.service;

import edu.ustb.blog.dao.ArticleMapper;
import edu.ustb.blog.entity.Article;
import edu.ustb.blog.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

/**
 * @projectName: sblog
 * @package: edu.ustb.blog.service
 * @className: ArticleService
 * @author: FangLei
 * @description:
 * @date: 2023/7/11 15:27
 * @version: 1.0
 */
public class ArticleService {

    public ArrayList<Article> getHotArticle() {
        ArrayList<Article> hotArticleList = null;
        SqlSession session = null;
        try {
            session = MybatisUtil.getSession();
            ArticleMapper articleMapper = session.getMapper(ArticleMapper.class);
            hotArticleList = articleMapper.selectHotArticle();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(session != null){
                session.close();
            }
        }
        return hotArticleList;
    }
}
