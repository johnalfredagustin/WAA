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
        productList.add(new Product("Chair", new Double("199"), "Wooden chair"));
        productList.add(new Product("TV", new Double("486"), "42\" TV"));
        productList.add(new Product("Pillow", new Double("12"), "White pillow"));
        productList.add(new Product("Watch", new Double("89"), "Men watch"));
    }

    public static List<Product> getProductList() {
        return productList;
    }
    
    public static boolean addProduct(Product product) {
        return productList.add(product);
    }
    
    public static boolean modifyProduct(Product product) {
        int index=0;
        for (Product p : productList) {
            if (p.getIndex() == product.getIndex()) {
                productList.remove(p.getIndex());
                productList.add(p.getIndex(), product);
                return true;
            }
            index++;
        }
        return false;
    }
    
    public static Product getProduct(int index) {
        for (Product product : productList) {
            if (product.getIndex() == index) {
                return product;
            }
        }
        return null;
    }
    
    public static Product removeProduct(int index) {
        int i = 0;
        for (Product product : productList) {
            if (product.getIndex() == index) {
                return productList.remove(i);
            }
            i++;
        }
        return null;
    }
    
    
    public static int getMaxIndex() {
        int maxIndex = 0;
        for (Product product : productList) {
            maxIndex++;
        }
        return maxIndex;
    }
}
