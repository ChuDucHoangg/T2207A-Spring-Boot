package com.t2207a.t2207aspringboot.Service;

import com.t2207a.t2207aspringboot.Model.Product;
import com.t2207a.t2207aspringboot.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicelmpl implements IProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        if (product!=null){
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        if (product!=null){
            Product product1 = productRepository.getById(id);
            if (product1!=null){
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
                product1.setDescription(product.getDescription());
                product1.setThumbail(product.getThumbail());

                return productRepository.save(product1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteProduct(int id) {
        if (id>=1){
            Product product = productRepository.getById(id);
            if (product!=null);
            productRepository.delete(product);
            return true;
        }
        return false;
    }

    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }
}
