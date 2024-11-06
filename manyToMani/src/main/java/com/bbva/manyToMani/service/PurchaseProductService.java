package com.bbva.manyToMani.service;

import com.bbva.manyToMani.model.PurchaseProduct;

import java.util.List;

public interface PurchaseProductService {
    public List<PurchaseProduct>allDetails();
    public List<PurchaseProduct>OnePurchase(Long id);
}
