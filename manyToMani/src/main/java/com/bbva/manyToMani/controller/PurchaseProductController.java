package com.bbva.manyToMani.controller;

import com.bbva.manyToMani.model.PurchaseProduct;
import com.bbva.manyToMani.service.Impl.PurchaseProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/detail/")
public class PurchaseProductController {
    @Autowired
    private PurchaseProductServiceImpl purchaseProductService;
    @GetMapping("all")
    public ResponseEntity<List<PurchaseProduct>>all(){
        return ResponseEntity.ok(purchaseProductService.allDetails());
    }
    @GetMapping("{id}")
    public ResponseEntity<List<PurchaseProduct>>one(@PathVariable Long id){
        return ResponseEntity.ok(purchaseProductService.OnePurchase(id));
    }
}
