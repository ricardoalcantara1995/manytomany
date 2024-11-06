package com.bbva.manyToMani.repository;

import com.bbva.manyToMani.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseReposity extends JpaRepository<Purchase,Long> {
}
