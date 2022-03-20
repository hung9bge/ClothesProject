/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Model.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUNGLM
 */
public class AccountDBContext extends DBContext {

    public Account getAccount(String name, String password) {
        Account account = new Account();
        try {
            String sql = " select a.name, a.password\n"
                    + "from account a\n"
                    + "where a.name =? and a.password =?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, name);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                account = new Account();
                account.setName(name);
                account.setPassword(password);
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        AccountDBContext dao = new AccountDBContext();
        Account a = dao.getAccount("hung", "123");
        System.out.println(a);
    }
}
