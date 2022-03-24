/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Model.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUNGLM
 */
public class CategoryDBContext extends DBContext {

    Query query = new Query();

    public ArrayList<Category> getAllCategories() {
        ArrayList<Category> categories = new ArrayList<>();
        String sql = this.query.getAllCategories;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                categories.add(new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("status")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }

    public ArrayList<Category> getAllCategoriesForSetting() {
        ArrayList<Category> categories = new ArrayList<>();
        String sql = this.query.getAllCategoriesForSetting;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                categories.add(new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("status")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }

    public Category getCategoryById(int id) {
        Category category = new Category();
        String sql = this.query.getCategoryById;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                category = new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("status"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return category;
    }

    public void ChangeStatus(Category category) {
        String sql;
        if (category.getStatus().equals("hide")) {
            sql = this.query.showCategoryStatus;
        } else {
            sql = this.query.hideCategoryStatus;
        }
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, category.getCate_id());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editCategory(Category category) {
        String sql = this.query.editCategory;

        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, category.getName());
            stm.setString(2, category.getStatus());
            stm.setInt(3, category.getCate_id());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addCategory(Category category) {
        String sql = this.query.addCategory;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, category.getName());
            stm.setString(2, category.getStatus());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteCategory(int id) {
        String sql = this.query.deleteCategory;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        CategoryDBContext dao = new CategoryDBContext();
        Category c = new Category("giay new", "show");
        dao.addCategory(c);
    }
}
