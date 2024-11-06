package com.bbva.manyToMani.repository;

import com.bbva.manyToMani.model.PurchaseProductId;
import com.bbva.manyToMani.model.PurchaseProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchaseProductRepository extends JpaRepository<PurchaseProduct, PurchaseProductId> {
    Optional<List<PurchaseProduct>>findByPurchaseId(Long id);
}
