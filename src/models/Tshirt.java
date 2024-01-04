package models;

import java.util.Arrays;

public class Tshirt {
    String name;
    String product_code;

    int price;
    String brand;

    String des;

    String[] size;
    public Tshirt(String name, String product_code, int price, String brand, String des,String[] size) {//constructor
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.des = des;
        this.size = size;
    }

    public String getName() {//getter for item name
        return name;
    }

    public void setName(String name) {//setter for item name
        this.name = name;
    }

    public String getProduct_code() {//getter for product code
        return product_code;
    }

    public void setProduct_code(String product_code) {//setter for product code
        this.product_code = product_code;
    }

    public int getPrice() {//getter for price
        return price;
    }

    public void setPrice(int price) {//setter for price
        this.price = price;
    }

    public String getBrand() {//getter for brand
        return brand;
    }

    public void setBrand(String brand) {//setter for brand
        this.brand = brand;
    }

    public String getDes() {//getter for description
        return des;
    }

    public void setDes(String des) {//setter for description
        this.des = des;
    }

    public String[] getSize() {//getter for size
        return size;
    }

    public void setSize(String[] size) {//setter for size
        this.size = size;
    }

    public void product_info(){//function to display item information
    String name = this.name;
    String product_code = this.product_code;
    int price = this.price;
    String brand = this.brand;
    String des = this.des;

        System.out.println("Item name:"+this.name);
        System.out.println("Description:"+this.des);
        System.out.println("Price:"+this.price);
        System.out.println("Sizes:"+ Arrays.toString(size));
        System.out.println("\n\n");
    }
}
