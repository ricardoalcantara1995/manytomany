package com.bbva.manyToMani.controller;

import com.bbva.manyToMani.dto.ProductDTO;
import com.bbva.manyToMani.model.Product;
import com.bbva.manyToMani.service.Impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product/")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;
    @GetMapping("all")
    public ResponseEntity <List<Product>> allProducts () {
        List products = productService.allProducts();
        return ResponseEntity.ok(products);
    }
    @GetMapping("{id}")
    ResponseEntity<Product>oneProduct(@PathVariable Long id){
        return ResponseEntity.ok(productService.oneProduct(id));
    }
    @PostMapping("save")
    ResponseEntity<Product>saveProduct(@RequestBody ProductDTO dto){
        return ResponseEntity.ok(productService.saveProduct(dto));
    }
    @PutMapping("{id}")
    ResponseEntity<Product>updateProduct(@PathVariable Long id,@RequestBody ProductDTO dto){
        return ResponseEntity.ok(productService.updateProduct(id,dto));
    }
    @DeleteMapping("{id}")
    ResponseEntity<Product>deleteProduct(@PathVariable Long id){
        return  ResponseEntity.ok(productService.deleteProduct(id));
    }
}
