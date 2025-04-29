package com.invetario.inventariotibu.domain.FKclass;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductProviderID implements Serializable {
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "provider_id")
    private String providerId;
}
