package com.petproject.coffeshopmanager.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Variety {
    @Id
    @SequenceGenerator(
            name = "variety_sequence",
            sequenceName = "variety_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "variety_sequence"
    )
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private Long weight;

    @Column(name = "price")
    private Long price;
}
