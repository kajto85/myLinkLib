package pl.kaj2.servlet;

import pl.kaj2.dao.UserDao;
import pl.kaj2.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/SigninServlet")
public class SigninServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String passwordConfirm = request.getParameter("passwordConfirm");

        User user;
        UserDao userDao = new UserDao();
        if (password.equals(passwordConfirm)) {
            user = new User(username, password);
            userDao.createUser(user);
            System.out.println("Dodano nowego uzytkownika");
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        }else
            response.getWriter().println("Cos poszło nie tak ");

    }


}
