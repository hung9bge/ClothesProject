/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

/**
 *
 * @author HUNGLM
 */
public class Query {
    //==============Product===================
    String getProductsByCateId = "select * from product where category_id = ? and status = 'show'";
    String getProductById = "select * from product where id = ? ";
    String getProductAll = "select * from product";
    String hideStatus = "UPDATE [product] SET [status] = 'hide' WHERE id = ?";
    String showStatus = "UPDATE [product] SET [status] = 'show' WHERE id = ?";
    String edit = "UPDATE [product] SET [name] = ?,[price] = ?,[img] = ?,[category_id] = ? WHERE [id] = ?";
    //==============Category==================
    String getAllCategories = "select * from category";
    String getCategoryById = "  select * from category where id = ?";
    
    
  
   
}
