package com.t2207a.t2207aspringboot.Service;

import com.t2207a.t2207aspringboot.Model.Product;

import java.util.List;

public interface IProductService {
    //create product
    public Product createProduct(Product product);

    //update product
    public Product updateProduct(int id, Product product);

    //delete product
    public boolean deleteProduct(int id);

    //get product
    public List<Product> getProduct();
}
