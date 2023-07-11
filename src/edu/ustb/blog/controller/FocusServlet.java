package edu.ustb.blog.controller;

import edu.ustb.blog.entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FocusServlet", value = "/focus")
public class FocusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("user");
        if(user == null){

        }else{
            String userId = request.getParameter("id");
            //查询用户所有关注
            User user1 = new User();
            user1.setId(1);
            user1.setImage("statics/images/8e5da64c712d2bb59235d8d746108cb1.jpeg");
            user1.setUserNick("小明");
            User user2 = new User();
            user2.setId(2);
            user2.setImage("statics/images/8e5da64c712d2bb59235d8d746108cb1.jpeg");
            user2.setUserNick("小红");
            User user3 = new User();
            user3.setId(1);
            user3.setImage("statics/images/8e5da64c712d2bb59235d8d746108cb1.jpeg");
            user3.setUserNick("awigins");

            List<User> users = new ArrayList<>();
            users.add(user1);
            users.add(user2);
            users.add(user3);

            request.setAttribute("MyFocusList",users);
        }
        request.getRequestDispatcher("GuanZhu.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
