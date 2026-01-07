package com.code.SpringBoot.service;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.code.SpringBoot.model.Product;
import com.code.SpringBoot.repository.ProductRepository;

@Service

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(int id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new NoSuchElementException();
        } else {
            return product;
        }
    }

    public Product add(Product product) {
        return productRepository.add(product);
    }

    public void remove(int id) {
        Product product = findById(id);
        productRepository.remove(product);
    }

    public Product update(int id, Product product) {
        Product productUpd = findById(id);
        productUpd.setName(product.getName());
        productUpd.setDescription(product.getDescription());
        productUpd.setPrice(product.getPrice());
        productUpd.setImageUrl(product.getImageUrl());
        return productUpd;
    }

}
