package com.bbva.manyToMani.service;

import com.bbva.manyToMani.dto.PurchaseDTO;
import com.bbva.manyToMani.model.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseService {
    public List<Purchase>allPurchase();
    public Purchase onePurchase(Long id);
    public Purchase savePurchase();

}
