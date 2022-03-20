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
    private int role;
    private int phone;
    private String address;
    private String displayname;
    
   

    public Account() {
    }

    public Account(int id, String name, String password, int role, int phone, String address, String displayname) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
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
        return "Account{" + "id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + ", phone=" + phone + ", address=" + address + ", displayname=" + displayname + '}';
    }
    
    
}
