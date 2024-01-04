package models;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Order {
    String name;
    int ph_no;

    int[] items;

    double[] price;


    public Order(String name, int ph_no, int[] items, double[] price) { //constructor
        this.name = name;
        this.ph_no = ph_no;
        this.items = items;
        this.price = price;
    }

    public String getName() {//getter for name
        return name;
    }

    public void setName(String name) {//setter for name
        this.name = name;
    }

    public int getPh_no() {//getter for phone number
        return ph_no;
    }

    public void setPh_no(int ph_no) {//setter for phone number
        this.ph_no = ph_no;
    }

    public int[] getItems() {//getter for items
        return items;
    }

    public void setItems(int[] items) {//setter for items
        this.items = items;
    }

    public double[] getPrice() {//getter for price
        return price;
    }

    public void setPrice(double[] price) {//setter for price
        this.price = price;
    }
    public void vat() {//function to display order details
        double total = 0;
        for (double price : price) {
            total += price;
        }

        String name = this.name;
        int ph_no = this.ph_no;
        double[] price = this.price;
        int[] items= this.items;
        double vat = total*0.13;    //VAT is calculated
        double grand_total = total + vat;   //Grand total is calculated

        System.out.println("\nOrder details: \n");
        System.out.println("Name: "+name);  //Name of the person ordering is displayed
        System.out.println("Phone number: "+ph_no);//Phone number of the person ordering is displayed
        System.out.println("Price: " + Arrays.toString(price));//Price of the ordered items is displayed
        System.out.println("Items:"+Arrays.toString(items)); //number of items are displayed
        System.out.println("Total: "+total);//total excluding  vat is displayed
        System.out.println("Grand Total with VAT:"+grand_total);//Total with VAT is displayed
    }
}
