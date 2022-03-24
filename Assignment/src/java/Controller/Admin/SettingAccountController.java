/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import Dal.AccountDBContext;
import Dal.ProductDBContext;
import Model.Account;
import com.sun.accessibility.internal.resources.accessibility;
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
public class SettingAccountController extends HttpServlet {

  
    AccountDBContext accountDBContext = new AccountDBContext();

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String action = request.getParameter("action");
        if (action == null || action.length() == 0 || action == "") {
            listDefault(request, response);
        } else {
            switch (action) {
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
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              String action = request.getParameter("action");
        switch (action) {
            case "editAccountPost":
                editAccountPost(request, response);
                break;
            case "addAccountPost":
                addAccountPost(request, response);
        }
    }


//=========================METHOD GET========================================
    private void listDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Account> accountAll = accountDBContext.getAccountAll();
        request.setAttribute("accountAll", accountAll);
        request.getRequestDispatcher("web/Admin/all_account.jsp").forward(request, response);
    }

   private void editGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Account account = accountDBContext.getAccountById(id);
        request.setAttribute("accountDetail", account);
        request.getRequestDispatcher("web/Admin/edit_account.jsp").forward(request, response);
    }
   private  void addGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
 request.getRequestDispatcher("web/Admin/add_account.jsp").forward(request, response);   
    }
   
   //=========================METHOD POST======================================
    private void editAccountPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        int phone = Integer.parseInt(request.getParameter("phone")); 
        String address = request.getParameter("address");
        String displayname = request.getParameter("displayname");
        Account account = new Account(id, name, password, phone, address, displayname);
        accountDBContext.editAccount(account);
        response.sendRedirect("SettingAccount");
    }
 
    private void addAccountPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        int phone = Integer.parseInt(request.getParameter("phone")); 
        String address = request.getParameter("address");
        String displayname = request.getParameter("displayname");
      Account account = new Account(name, password, phone, address, displayname);
        accountDBContext.addGet(account);
        response.sendRedirect("SettingAccount");
        
    }
    private void deletePost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int id = Integer.parseInt(request.getParameter("id"));
          Account account = accountDBContext.getAccountById(id);
        accountDBContext.delete(account.getId());
        response.sendRedirect("SettingAccount");
    
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
