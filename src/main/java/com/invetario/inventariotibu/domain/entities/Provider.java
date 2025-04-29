package com.invetario.inventariotibu.domain.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "providers")
@Entity
public class Provider {
    @Id
    @Column(name = "id_provider", length = 20, nullable = false)
    private String id;

    @Column(name = "name_provider", length = 50, nullable = false)
    private String nameProvider;
    
    @Column(name = "address_provider", length = 50, nullable = false)   
    private String addressProvider;

    @OneToMany(mappedBy = "provider")
    private Set<ProductProvider> productProvider = new HashSet<>();
}
