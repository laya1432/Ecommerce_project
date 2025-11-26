package com.ecommerce.controller;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ProductController extends HttpServlet {

    private ProductDAO productDAO = new ProductDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<Product> products = productDAO.getAllProducts();
        req.setAttribute("products", products);

        RequestDispatcher dispatcher = req.getRequestDispatcher("product-list.jsp");
        dispatcher.forward(req, resp);
    }
}

