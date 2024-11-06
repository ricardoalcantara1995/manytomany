package com.bbva.manyToMani.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_purchaseproduct")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseProduct {

    @EmbeddedId
    private PurchaseProductId id;

    @ManyToOne
    @MapsId("purchaseId") //vincula a purchase
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;

    @ManyToOne
    @MapsId("productId") //vincula a producto
    @JoinColumn(name="product_id")
    private Product product;

    @Column(name = "quantity")
    private int quantity;
}
