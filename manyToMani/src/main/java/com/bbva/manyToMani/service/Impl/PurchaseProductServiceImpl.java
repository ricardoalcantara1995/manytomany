package com.bbva.manyToMani.service.Impl;

import com.bbva.manyToMani.model.PurchaseProduct;
import com.bbva.manyToMani.repository.PurchaseProductRepository;
import com.bbva.manyToMani.repository.PurchaseReposity;
import com.bbva.manyToMani.service.ProductService;
import com.bbva.manyToMani.service.PurchaseProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseProductServiceImpl implements PurchaseProductService{
    @Autowired
    private PurchaseProductRepository purchaseProductRepository;
    @Autowired
    private ProductService productService;

    @Override
    public List<PurchaseProduct> allDetails() {
        List <PurchaseProduct>detail = purchaseProductRepository.findAll();
        return detail;
    }

    @Override
    public List<PurchaseProduct> OnePurchase(Long id) {
        return purchaseProductRepository.findByPurchaseId(id).get();
    }
}
