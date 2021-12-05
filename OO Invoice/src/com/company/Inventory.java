package com.company;

public class Inventory {
    private String product;
    private double price;

    public String getProduct()   // setting to return the product when asked
    {
        return product;
    }

    public void setProduct(String product) // setting to set the product when asked
    {
        this.product = product;
    }

    public double getPrice() // setting to return the price when asked
    {
        return price;
    }

    public void setPrice(double price)  // setting to set the price when asked
    {
        this.price = price;
    }


}
