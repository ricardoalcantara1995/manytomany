package com.bbva.manyToMani.service.Impl;

import com.bbva.manyToMani.model.Purchase;
import com.bbva.manyToMani.repository.PurchaseReposity;
import com.bbva.manyToMani.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private PurchaseReposity purchaseReposity;

    @Override
    public List<Purchase> allPurchase() {
        return purchaseReposity.findAll();
    }

    @Override
    public Purchase onePurchase(Long id) {
        return purchaseReposity.findById(id).get();
    }

    @Override
    public Purchase savePurchase() {
        Purchase newPurchase = new Purchase(LocalDateTime.now());
        return purchaseReposity.save(newPurchase);
    }


}
