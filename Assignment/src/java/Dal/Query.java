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
    String getProductsByCateId = "select * from product where category_id = ?";
    
    
    //==============Category==================
    String getAllCategories = "select * from category";
    String getCategoryById = "  select * from category where id = ?";
    
    //==============ProductDetail==================
    String getProductById = "select * from product where id = ? ";
}
