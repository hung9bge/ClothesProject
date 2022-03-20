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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUNGLM
 */
public class ProductDBContext extends DBContext {

    public ArrayList<Product> getProduct(String name, String password)
    {
        ArrayList<Product> product = new ArrayList<>(); 
        try {
    String sql = "    Select p.id, p.name as name, a.password, p.img, a.display_name,c.name\n" +
        "   from account a inner join product p on p.account_id = a.id inner join category c on p.category_id = c.id\n" +
        "   where a.name=? and a.password=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, name);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
               Product p = new Product();
               p.setId(rs.getInt("p.id"));
               p.setImg(rs.getString("p.img"));
               p.setName(rs.getString("p.name"));
               p.setPrice(rs.getInt("p.price"));
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
}