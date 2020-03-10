package pl.kaj2.servlet;

import pl.kaj2.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String username =request.getParameter("username");
            String userpass =request.getParameter("userpass");
            UserDao userDao = new UserDao();
            int id =0;

            id=userDao.readUser(username,userpass);
            if (id>0) {
                request.getSession().setAttribute("userId", id);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else
            request.getRequestDispatcher("loginError.jsp").forward(request, response);
    }


}
