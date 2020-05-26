import models.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customerServlet",urlPatterns = "/display")
public class customerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList=new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","5d3a66f962710e25dc99ffa3.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","126297f7dfb736e96fa6_wnxy.jpg"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","beauty-upload-api-metrip-web-nguyenntran-khanhly_-190111154410.jpg"));
        customerList.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây","images.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","images (1).jpg"));
        request.setAttribute("list",customerList);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
