/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dal.CategoryDBContext;
import Dal.ProductDBContext;
import Model.Account;
import Model.Product;
import Model.Category;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HUNGLM
 */
public class ProductController extends HttpServlet {

    ProductDBContext productDBContext = new ProductDBContext();
    CategoryDBContext categoryDBContext = new CategoryDBContext();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        ArrayList<Category> categoriesList = categoryDBContext.getAllCategories();
        request.setAttribute("categoriesList", categoriesList);
        String action = request.getParameter("action");
        if (action == null || action.length() == 0) {
            request.getRequestDispatcher("web/home.jsp").forward(request, response);
        }
        switch (action) {
            case "getProductByCate":
                getProductByCate(request, response);
                break;
            case "getProductById":
                getProductById(request, response);
                break;

        }
    }

    private void getProductByCate(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int cate_id = Integer.parseInt(request.getParameter("id"));
        ArrayList<Product> productsList = productDBContext.getProductsByCateId(cate_id);
        Category category = categoryDBContext.getCategoryById(cate_id);
        request.setAttribute("category", category);
        request.setAttribute("productsList", productsList);
        request.getRequestDispatcher("web/quan_ao.jsp").forward(request, response);
    }

    private void getProductById(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int product_id = Integer.parseInt(request.getParameter("id"));
        int category_id = Integer.parseInt(request.getParameter("cateId"));
        ArrayList<Product> productsList = productDBContext.getProductsByCateId(category_id);
        Product productDetail = productDBContext.getProductById(product_id);
        request.setAttribute("productDetail", productDetail);
        request.setAttribute("productsList", productsList);
        request.getRequestDispatcher("web/product_detail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
