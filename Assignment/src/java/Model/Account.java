/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HUNGLM
 */
public class Account {
    private int id;
    private String name;
    private String password ;
  
    private String phone;
    private String address;
    private String displayname;
    
   

    public Account() {
    }

    public Account(int id, String name, String password,  String phone, String address, String displayname) {
        this.id = id;
        this.name = name;
        this.password = password;
    
        this.phone = phone;
        this.address = address;
        this.displayname = displayname;
    }
 public Account( String name, String password, String phone, String address, String displayname) {
     
        this.name = name;
        this.password = password;
      
        this.phone = phone;
        this.address = address;
        this.displayname = displayname;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", password=" + password +  ", phone=" + phone + ", address=" + address + ", displayname=" + displayname + '}';
    }
    
    
}
