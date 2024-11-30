package com.ashmit.ecommerce.product;

import com.ashmit.ecommerce.category.Category;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private double availableQuantity;
    private BigDecimal price; //ALWAYS USE BIGDECIMAL FOR CURRENCY/PRICE
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
