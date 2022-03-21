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
public class Product extends Category{
    private int id;
    private String name;
    private Double price;
    private String img;
    private String status;

    public Product() {
    }

    public Product(int id, String name, Double price, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
    }

    public Product(int id, String name, Double price, String img, String category_id, int cate_id, String cate_name) {
        super(cate_id, cate_name);
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
    }

    public Product(int id, String name, Double price, String img, String status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
        this.status = status;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", img=" + img + ", status=" + status + '}';
    }
    

    
}
