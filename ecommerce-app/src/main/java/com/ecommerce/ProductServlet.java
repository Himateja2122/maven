package com.ecommerce;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("product1", "Laptop");
        request.setAttribute("price1", "50000");

        request.setAttribute("product2", "Mobile");
        request.setAttribute("price2", "20000");

        request.getRequestDispatcher("products.jsp")
               .forward(request, response);
    }
}
