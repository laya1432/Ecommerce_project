package com.ecommerce.dao;

import com.ecommerce.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Laptop", 54000));
        products.add(new Product(2, "Smartphone", 23000));
        products.add(new Product(3, "Smartwatch", 8000));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}

