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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUNGLM
 */
public class AccountDBContext extends DBContext {

    Query query = new Query();

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
        return account;
    }
      public Account getAccountById(int id) {
        Account account = new Account();
        String sql = this.query.getAccountById;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                account = new Account(
                  rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("password"),
                        rs.getString("phone_number"),
                        rs.getString("address"),
                        rs.getString("display_name"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;

    }


    public ArrayList<Account> getAccountAll() {
        ArrayList<Account> accountList = new ArrayList<>();
        String sql = this.query.getAccountAll;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                accountList.add(new Account(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("password"),
                        rs.getString("phone_number"),
                        rs.getString("address"),
                        rs.getString("display_name")));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountList;

    }

    public void editAccount(Account account) {
        String sql = this.query.editAccount;

        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, account.getName());
            stm.setString(2, account.getPassword());
            stm.setString(3, account.getPhone());
            stm.setString(4, account.getAddress());
            stm.setString(5, account.getDisplayname());
            stm.setInt(6, account.getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addGet(Account account) {
        String sql = this.query.addAccount;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, account.getName());
            stm.setString(2, account.getPassword());
            stm.setString(3, account.getPhone());
            stm.setString(4, account.getAddress());
            stm.setString(5, account.getDisplayname());

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(int id) {
        String sql = this.query.deleteAccount;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        AccountDBContext dao = new AccountDBContext();
      Account account= new Account("hung2662001", "1424234", "0977026555", "yendong ý yên", "hung2660021");
      
       dao.addGet(account);
    }
}
