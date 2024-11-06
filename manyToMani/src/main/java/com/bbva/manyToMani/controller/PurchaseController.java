package com.bbva.manyToMani.controller;

import com.bbva.manyToMani.dto.PurchaseDTO;
import com.bbva.manyToMani.model.Product;
import com.bbva.manyToMani.model.Purchase;
import com.bbva.manyToMani.service.Impl.PurchaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchase/")
public class PurchaseController {
@Autowired
    private PurchaseServiceImpl purchaseService;
    @GetMapping("all")
    ResponseEntity<List<Purchase>>allPurchase(){
        List purchases = purchaseService.allPurchase();
        return ResponseEntity.ok(purchases);
    }
    @GetMapping("{id}")
    public ResponseEntity<Purchase>onePurchase(@PathVariable Long id){
        return ResponseEntity.ok(purchaseService.onePurchase(id));
    }
    @PostMapping("save")
    ResponseEntity<Long>newPurchase(){
        return ResponseEntity.ok(purchaseService.savePurchase().getId());
    }
}

