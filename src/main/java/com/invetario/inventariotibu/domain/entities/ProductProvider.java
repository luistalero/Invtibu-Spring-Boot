package com.invetario.inventariotibu.domain.entities;

import com.invetario.inventariotibu.domain.FKclass.ProductProviderID;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "products_providers")
@Entity
public class ProductProvider {
    @EmbeddedId
    private ProductProviderID id;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "provider_id", insertable = false, updatable = false)
    private Provider provider;
}
