package com.t2207a.t2207aspringboot.Controller;

import com.t2207a.t2207aspringboot.Model.Product;
import com.t2207a.t2207aspringboot.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/")
    public String home(){
        return "Home";
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return iProductService.createProduct(product);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestParam("id") int id, @RequestBody Product product){
        return iProductService.updateProduct(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteProduct(@PathVariable("id") int id){
        return iProductService.deleteProduct(id);
    }

    @GetMapping("/list")
    public List<Product> getProduct(){
        return iProductService.getProduct();
    }
}
