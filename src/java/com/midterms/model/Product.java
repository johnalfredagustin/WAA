/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.midterms.model;

import com.midterms.db.ProductDB;
import java.util.List;

/**
 *
 * @author John Agustin
 */
public class Product {
    
    private int index;
    private String name;
    private Double price;
    private String description;

    public Product(String name, Double price, String description) {
        this.index = ProductDB.getMaxIndex();
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    public Product(int index, String name, Double price, String description) {
        this.index = index;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
