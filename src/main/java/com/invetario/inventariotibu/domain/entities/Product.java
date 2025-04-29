package com.invetario.inventariotibu.domain.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "products")
@Entity
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_product", length = 50, nullable = true)
    String productName;

    @Column(name = "product_stock", columnDefinition = "INTEGER")
    int stock;

    @OneToMany(mappedBy = "product")
    private Set<ProductProvider> productProvider = new HashSet<>();
    
}
