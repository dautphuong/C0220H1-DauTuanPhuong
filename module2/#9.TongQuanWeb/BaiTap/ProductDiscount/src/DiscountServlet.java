import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        float price = Float.parseFloat(request.getParameter("list"));
        float percent = Float.parseFloat(request.getParameter("percent"))/100;

        double amount = price*percent*0.1;
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<h2>Product Discount Calculator</h2>");
        out.println("<label>Product Description :</label>");
        out.println("$"+product+"<br/>");
        out.println("<label>Price:</label>");
        out.println(price+"<br/>");
        out.println("<label>Discount Percent:</label>");
        out.println(percent + "%<br/>");
        out.println("<label>Discount Amount:</label>");
        out.println("$"+amount+"<br/>");
        out.println("<label>Discount Price:</label>");
        out.println("$"+(price - amount));
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
