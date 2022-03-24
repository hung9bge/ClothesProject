/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import Dal.ProductDBContext;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.JDBCType;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.classfilewriter.annotations.IntAnnotationValue;

/**
 *
 * @author HUNGLM
 */
public class SettingProductController extends HttpServlet {

    ProductDBContext productDBContext = new ProductDBContext();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null || action.length() == 0 || action == "") {
            listDefault(request, response);
        } else {
            switch (action) {
                case "changeStatus":
                    changeStatus(request, response);
                    break;
                case "editGet":
                    editGet(request, response);
                    break;
                case "addGet":
                    addGet(request, response);
                    break;
                case "deletePost":
                    deletePost(request, response);
            }

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "editPost":
                editPost(request, response);
                break;
            case "addPost":
                addPost(request, response);
        }
    }

    //=========================METHOD GET========================================
    private void listDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Product> productAll = productDBContext.getProductAll();
        request.setAttribute("productAll", productAll);
        request.getRequestDispatcher("web/Admin/index.jsp").forward(request, response);
    }

    private void changeStatus(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productDBContext.getProductById(id);
        productDBContext.ChangeStatus(product);
        response.sendRedirect("SettingProductController");
    }
   

    private void editGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productDBContext.getProductById(id);
        request.setAttribute("productDetail", product);
        request.getRequestDispatcher("web/Admin/edit.jsp").forward(request, response);
    }
   private  void addGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
 request.getRequestDispatcher("web/Admin/add.jsp").forward(request, response);   
    }
    //=========================METHOD POST======================================
    private void editPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        String img = request.getParameter("image");
        String status = request.getParameter("status");
        Product newProduct = new Product(id, name, price, img, status);
        productDBContext.editProduct(newProduct);
        response.sendRedirect("SettingProductController");
    }
 
    private void addPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String name = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        String img = request.getParameter("image");
        String status = request.getParameter("status");
        Product newProduct = new Product( name, price, img, status);
        productDBContext.addGet(newProduct);
        response.sendRedirect("SettingProductController");
        
    }
    private void deletePost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int id = Integer.parseInt(request.getParameter("id"));
          Product product = productDBContext.getProductById(id);
        productDBContext.delete(product.getId());
        response.sendRedirect("SettingProductController");
    
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
