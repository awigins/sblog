package edu.ustb.blog.controller;

import edu.ustb.blog.entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String state = request.getParameter("State");
        String userId = request.getParameter("id");
        if("detail".equals(state)){ //查询博主的详细信息
            //查询该博主的所有文章，按时间排序
            //TODO
            request.getRequestDispatcher("GeRenZhuYe.jsp").forward(request,response);
        }else if("focus".equals(state)){ //关注该博主
            //1.从session中获取用户登录信息
            User user = (User) request.getSession().getAttribute("user");
            if(user == null){ //用户未登录，关注失败
                request.setAttribute("result","fail");
            }
            else{ //用户已登录
                //调用service，关注
                //TODO
                request.setAttribute("result","ok");
            }
        }else if("unfollow".equals(state)){ //取消关注该博主
            //1.从session中获取用户登录信息
            User user = (User) request.getSession().getAttribute("user");
            if(user == null){ //用户未登录，取消关注失败
                request.setAttribute("result","fail");
            }
            else{ //用户已登录
                //调用service，取消关注
                //TODO
                request.setAttribute("result","ok");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
