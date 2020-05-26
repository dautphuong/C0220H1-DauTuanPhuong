package codegym;

import codegym.models.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        request.setAttribute("dataDB", "thong tin gia dinh");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Long", "2k"));
        studentList.add(new Student("Khanh", "2k1"));
        studentList.add(new Student("Chau", "2k3"));
        request.setAttribute("abc", studentList);

        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Nhan data
        String userAbc = request.getParameter("username");

        // Cach 1
//        PrintWriter out = response.getWriter();
//        out.print("<html>");
//        out.print(userAbc);
//        out.print("</html>");

        // Cach 2
        request.getRequestDispatcher("/home.jsp").forward(request, response);

        // Cach 3
//        response.sendRedirect("/home.jsp");
    }
}
