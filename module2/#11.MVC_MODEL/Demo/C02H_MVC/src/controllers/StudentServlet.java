package controllers;

import models.Student;
import services.StudentService;
import services.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentServlet", urlPatterns = "/student")
public class StudentServlet extends HttpServlet {

    StudentService studentService = new StudentServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                createStudent(request, response);
                break;
        }
    }

    private void createStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = (int) (Math.random() * 100000);
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        Student student = new Student(id, name, birthday);

        studentService.save(student);
        String message = "Register successfully!";

        request.setAttribute("message", message);
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            default:
                getListStudent(request, response);
                break;
        }

    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.sendRedirect("/create.jsp");
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }

    private void getListStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listStudent", studentService.findAll());
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
