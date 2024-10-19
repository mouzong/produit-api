package com.produit.produitservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long person_id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "person")
    private Set<Address> addressList;
}
