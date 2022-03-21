/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Model.Account;
import Model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUNGLM
 */
public class ProductDBContext extends DBContext {

    Query query = new Query();

    public ArrayList<Product> getProduct(String name, String password) {
        ArrayList<Product> product = new ArrayList<>();
        try {
            String sql = "    Select p.id, p.name as name, a.password, p.img, a.display_name,c.name\n"
                    + "   from account a inner join product p on p.account_id = a.id inner join category c on p.category_id = c.id\n"
                    + "   where a.name=? and a.password=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, name);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("p.id"));
                p.setImg(rs.getString("p.img"));
                p.setName(rs.getString("p.name"));
                p.setPrice(rs.getDouble("p.price"));
                Account account = new Account();
                account.setName(rs.getString("a.name"));
                account.setPassword(rs.getString("a.password"));
                product.add(p);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    public ArrayList<Product> getProductsByCateId(int id) {
        ArrayList<Product> product = new ArrayList<>();
        String sql = this.query.getProductsByCateId;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getString("img"));
                product.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    public Product getProductById(int id) {
        Product product = new Product();
        String sql = this.query.getProductById;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                product = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getString("img"),
                        rs.getString("status"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;

    }

    public ArrayList<Product> getProductAll() {
        ArrayList<Product> productList = new ArrayList<>();
        String sql = this.query.getProductAll;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                productList.add(new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getString("img"),
                        rs.getString("status")));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productList;

    }

    public void ChangeStatus(Product product) {
        String sql;
        if (product.getStatus().equals("hide")) {
            sql = this.query.showStatus;
        } else {
            sql = this.query.hideStatus;
        }
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1,product.getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//    public static void main(String[] args) {
//        ProductDBContext dao = new ProductDBContext();
//        ArrayList<Product> list = dao.getProductsByCateId(1);
//        for (Product product : list) {
//            System.out.println(product);
//        }
//    }

    public static void main(String[] args) {
        ProductDBContext dao = new ProductDBContext();
        Product product = dao.getProductById(2);
        dao.ChangeStatus(product);

    }
}
