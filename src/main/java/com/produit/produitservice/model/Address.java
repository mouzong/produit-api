package com.produit.produitservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Address {
    @Id
    @GeneratedValue
    private long address_id;
    private String street;
    private String city;
    private String state;

    @ManyToOne
    @JoinColumn(name = "id")
    private Person person;

}
