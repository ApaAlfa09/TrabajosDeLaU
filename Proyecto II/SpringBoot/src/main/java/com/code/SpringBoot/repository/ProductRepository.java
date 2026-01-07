package com.code.SpringBoot.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.code.SpringBoot.model.Product;

@Repository

public class ProductRepository {
  private List<Product> products = new ArrayList<>();
  int nextId = 4; 

  public ProductRepository() {
    products.add(new Product(1, "Laptop", "High performance laptop", 120000, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-VWfGmP7w5pJdzvWJ6TZAooOWEjU0fCFJ3A&s"));
    products.add(new Product(2, "Smartphone", "Latest model smartphone", 60000, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKAboANa7SGcn862OlQIs9eALsZjHiG3IYlQ&s"));
    products.add(new Product(3, "Tablet", "Portable tablet device", 90000, "https://topesdegama.com/app/uploads-topesdegama.com/2020/05/Lenovo-Tab-M10-Plus-Gen-3-tablet.jpg"));
  }

  public List<Product> findAll() {
    return products;
  }

  public Product findById(int id) {
    return products.stream()
        .filter(product -> product.getId() == id)
        .findFirst()
        .orElse(null);
  }

  public Product add(Product product) {
    product.setId(nextId++); 
    products.add(product);
    return product;
  }

  public void remove(Product product) {
    products.remove(product);
  }

}
