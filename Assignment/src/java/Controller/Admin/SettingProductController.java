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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HUNGLM
 */
public class SettingProductController extends HttpServlet {

    ProductDBContext productDBContext= new ProductDBContext();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null || action.length() == 0 || action == ""){
            listDefault(request, response);
        }else{
            switch(action){
                case "changeStatus":
                    changeStatus(request, response);
                    break;
            }
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    
    
   //=========================METHOD GET========================================
    private void listDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Product> productAll = productDBContext.getProductAll();
        request.setAttribute("productAll", productAll);
        request.getRequestDispatcher("web/Admin/index.jsp").forward(request, response);
    }
    private void changeStatus(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productDBContext.getProductById(id);
        productDBContext.ChangeStatus(product);
        response.sendRedirect("SettingProductController");
            
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
