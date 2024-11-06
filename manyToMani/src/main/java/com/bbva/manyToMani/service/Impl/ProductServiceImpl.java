package com.bbva.manyToMani.service.Impl;

import com.bbva.manyToMani.dto.ProductDTO;
import com.bbva.manyToMani.model.Product;
import com.bbva.manyToMani.repository.ProductRepository;
import com.bbva.manyToMani.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> allProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product oneProduct(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product saveProduct(ProductDTO dto) {
        Product newProduct = new Product(dto.getName(),dto.getPrice());
        return productRepository.save(newProduct);
    }

    @Override
    public Product updateProduct(Long id, ProductDTO dto) {
        Product productSearch  = productRepository.findById(id).get();
        productSearch.setName(dto.getName());
        productSearch.setPrice(dto.getPrice());
        return productRepository.save(productSearch);
    }

    @Override
    public Product deleteProduct(Long id) {
        Product deleteProduct = productRepository.findById(id).get();
        productRepository.delete(deleteProduct);
        return deleteProduct;
    }
}