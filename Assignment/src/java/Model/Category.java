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
public class Category {
    private int  cate_id;
    private String cate_name;

    public Category() {
    }

    public Category(int cate_id, String cate_name) {
        this.cate_id = cate_id;
        this.cate_name = cate_name;
    }

    public int getCate_id() {
        return cate_id;
    }

    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }

    public String getName() {
        return cate_name;
    }

    public void setName(String name) {
        this.cate_name = name;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + cate_id + ", name=" + cate_name + '}';
    }
    
    
}
