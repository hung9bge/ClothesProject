/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import Model.Category;
import Dal.CategoryDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HUNGLM
 */
public class SettingCategoryController extends HttpServlet {

    CategoryDBContext categoryDBContext = new CategoryDBContext();

    @Override
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
                    break;
            }
        }
    }

    private void listDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Category> categoryAll = categoryDBContext.getAllCategoriesForSetting();
        request.setAttribute("categoryAll", categoryAll);
        request.getRequestDispatcher("web/Admin/category_list.jsp").forward(request, response);
    }

    private void changeStatus(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Category category = categoryDBContext.getCategoryById(id);
        categoryDBContext.ChangeStatus(category);
        response.sendRedirect("SettingCategoryController");
    }

    private void editGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Category category = categoryDBContext.getCategoryById(id);
        request.setAttribute("categoryDetail", category);
        request.getRequestDispatcher("web/Admin/edit_category.jsp").forward(request, response);
    }
    private void addGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("web/Admin/add_category.jsp").forward(request, response);
    }
    
    
    
    
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch(action){
            case "editPost":
                editPost(request, response);
                break;
            case "addPost":
                addPost(request, response);
                break;
                
        }
    }

    private void editPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String status = request.getParameter("status");
        Category newCategory = new Category(id, name, status);
        categoryDBContext.editCategory(newCategory);
        response.sendRedirect("SettingCategoryController");
    }
     private void addPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String status = request.getParameter("status");
        Category newCategory = new Category(name, status);
        categoryDBContext.addCategory(newCategory);
        response.sendRedirect("SettingCategoryController");

    }

    private void deletePost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Category category = categoryDBContext.getCategoryById(id);
        categoryDBContext.deleteCategory(category.getCate_id());
        response.sendRedirect("SettingCategoryController");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
