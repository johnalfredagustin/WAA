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
        productList.add(new Product(1, "Chair", new Double("199"), "Wooden chair"));
        productList.add(new Product(2, "TV", new Double("486"), "42\" TV"));
        productList.add(new Product(3, "Pillow", new Double("12"), "White pillow"));
        productList.add(new Product(4, "Watch", new Double("89"), "Men watch"));
    }

    public static List<Product> getProductList() {
        return productList;
    }

    public static boolean addProduct(Product product) {
        return productList.add(product);
    }

    public static boolean modifyProduct(Product product) {
        int index = 0;
        for (Product p : productList) {
            if (p.getIndex() == product.getIndex()) {
                productList.remove(index);
                productList.add(index, product);
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

    public static Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
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
        return productList.get(productList.size()-1).getIndex();
    }

}
