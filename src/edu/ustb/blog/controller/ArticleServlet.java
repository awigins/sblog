package edu.ustb.blog.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ArticleServlet", value = "/article")
public class ArticleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String state = request.getParameter("State");
        if("detail".equals(state)){ //查询文章详情
            //1.获取文章id
            String articleId = request.getParameter("id");
            //2.根据id查询这条文章

            //3.判断这条文章是否打开了评论区，如果打开了评论区则查询评论


        }else if("hot".equals(state)){ //查询10条热门文章

        }else if("close".equals(state)){ //关闭文章评论
            //1.获取文章id
            String articleId = request.getParameter("id");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
