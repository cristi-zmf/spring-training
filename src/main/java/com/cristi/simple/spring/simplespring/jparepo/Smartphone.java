package com.cristi.simple.spring.simplespring.jparepo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "SMARTPHONE")
@Setter @Getter
@NoArgsConstructor
@ToString
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SMARTPHONE_GEN", sequenceName = "SMARTPHONE_SEQ")
    private Long id;
    @Column
    private String brand;
    @Column
    private String model;
    @Column
    private String ramMemory;


    public Smartphone(String brand, String model, String ramMemory) {
        this.brand = brand;
        this.model = model;
        this.ramMemory = ramMemory;
    }

}
