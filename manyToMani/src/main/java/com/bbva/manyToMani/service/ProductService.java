package com.bbva.manyToMani.service;

import com.bbva.manyToMani.dto.ProductDTO;
import com.bbva.manyToMani.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ProductService {
    public List<Product>allProducts();
    public Product oneProduct(Long id);
    public Product saveProduct(ProductDTO dto);
    public Product updateProduct(Long id,ProductDTO dto);
    public Product deleteProduct(Long id);
}
