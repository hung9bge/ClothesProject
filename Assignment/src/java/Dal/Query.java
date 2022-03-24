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
    String hideProductStatus = "UPDATE [product] SET [status] = 'hide' WHERE id = ?";
    String showProductStatus = "UPDATE [product] SET [status] = 'show' WHERE id = ?";
    String editProduct = "UPDATE [product] SET [name] = ?,[price] = ?,[img] = ?,[status] = ? WHERE [id] = ?";
    String addProduct = "INSERT INTO [dbo].[product]([name],[price],[img],[status])\n" +
                 "VALUES(?,?,?,?)";
    String deleteProduct = "DELETE FROM [dbo].[product]WHERE id = ?";
    //==============Category==================
    String getAllCategories = "select * from category where status = 'show'";
    String getAllCategoriesForSetting = "select * from category";
    String getCategoryById = "  select * from category where id = ?";
    String hideCategoryStatus = "UPDATE [category] SET [status] = 'hide' WHERE id = ?";
    String showCategoryStatus = "UPDATE [category] SET [status] = 'show' WHERE id = ?";
    String editCategory = "UPDATE [category] SET [name] = ?, [status] = ? WHERE [id] = ?";
    String addCategory = "INSERT INTO [dbo].[category]([name],[status])VALUES(?,?)";
    String deleteCategory = "DELETE FROM [dbo].[category]WHERE id = ?";
     //==============Account==================
    String getAccountAll = "select * from account";
    String editAccount = "UPDATE [dbo].[account]SET [name] = ?,[password] = ?,[phone_number] = ?,[address] = ?,[display_name] = ? WHERE id = ?";
    String addAccount ="INSERT INTO [dbo].[account]([name],[password],[phone_number],[address],[display_name])VALUES(?,?,?,?,?)";
    String deleteAccount = "DELETE FROM [dbo].[account]WHERE id = ?";
    String getAccountById = "select * from account where id = ? ";
}
