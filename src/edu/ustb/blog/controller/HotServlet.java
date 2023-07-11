package edu.ustb.blog.controller;

import edu.ustb.blog.entity.Article;
import edu.ustb.blog.service.ArticleService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "NewServlet", value = "/hot")
public class HotServlet extends HttpServlet {

    ArticleService articleService = new ArticleService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        Article article1 = new Article();
//        article1.setId(1);
//        article1.setScores(100);
//        article1.setUserid(1);
//        article1.setThumbnail("images/essay_10001_6e99eb35e6.jpg");
//        article1.setTitle("第一篇文章");
//
//        Article article2 = new Article();
//        article2.setId(2);
//        article2.setScores(200);
//        article2.setUserid(1);
//        article2.setThumbnail("images/essay_10001_8dd1e515f2.jpg");
//        article2.setTitle("另一篇文章");
//
//        List<Article> articleList = new ArrayList<>();
//        articleList.add(article1);
//        articleList.add(article2);

        ArrayList<Article> articleList = articleService.getHotArticle();
        request.setAttribute("HotArticleList",articleList);
        request.getRequestDispatcher("/hot.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
