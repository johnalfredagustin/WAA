/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.midterms.db;

import com.midterms.model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author John Agustin
 */
public class ProductDB {
    
    private static List<Product> productList = new ArrayList<>();
    
    static {
        productList.add(new Product("Chair", 199, "Wooden chair"));
        productList.add(new Product("TV", 486, "42\" TV"));
        productList.add(new Product("Pillow", 12, "White pillow"));
        productList.add(new Product("Watch", 89, "Men watch"));
    }

    public static List<Product> getProductList() {
        return productList;
    }
    
    public static boolean addProduct(Product product) {
        return productList.add(product);
    }
    
    public static Product getProduct(int index) {
        for (Product product : productList) {
            if (product.getIndex() == index) {
                return product;
            }
        }
        return null;
    }
    
    
}
