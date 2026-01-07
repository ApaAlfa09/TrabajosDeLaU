package com.code.SpringBoot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.code.SpringBoot.model.Product;
import com.code.SpringBoot.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping(path = "/api/products")
public class ProductController {
    
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Product findById(@PathVariable int id) {
        return productService.findById(id);
    }

     @PostMapping
    public Product add(@RequestBody Product product) {
        return productService.add(product);
    }

    @DeleteMapping(path = "/{id}")
    public void remove(@PathVariable int id) {
        productService.remove(id);
    }

    @PutMapping(path = "/{id}")
    public Product update(@PathVariable int id, @RequestBody Product product) {
        return productService.update(id, product);
    }
}
