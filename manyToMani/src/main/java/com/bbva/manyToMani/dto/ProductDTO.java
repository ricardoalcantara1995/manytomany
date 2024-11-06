package com.bbva.manyToMani.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProductDTO {
    String name;
    double price;
}
