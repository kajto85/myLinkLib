package pl.kaj2.servlet;

import com.mysql.cj.Session;
import pl.kaj2.dao.LinkDao;
import pl.kaj2.model.Link;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

import static pl.kaj2.dao.LinkDao.check;

@WebServlet("/LibServlet")
public class LibServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String link = request.getParameter("link");
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String option = request.getParameter("option");



        try {
            LinkDao ld = new LinkDao();
            Link l = null;
            String operation = null;

            if ("add".equals(option) && check(link,title)) {
                l = new Link(link, title, description, (int) request.getSession().getAttribute("userId"));
                ld.create(l);
                operation = "dodałeś";
                request.setAttribute("linkAtr", l);
                request.setAttribute("operation", operation);
                request.getRequestDispatcher("result.jsp").forward(request, response);
            } else if ("read".equals(option)) {
                l = ld.read(title);
                operation = "odczytałeś";
                request.setAttribute("linkAtr", l);
                request.setAttribute("operation", operation);
                request.getRequestDispatcher("result.jsp").forward(request, response);


            } else if (option == null) {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }else {
                response.getWriter().println("null w linku lub pusty");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}

