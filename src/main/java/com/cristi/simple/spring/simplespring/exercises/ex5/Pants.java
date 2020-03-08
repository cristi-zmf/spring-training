package com.cristi.simple.spring.simplespring.exercises.ex5;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PANTS")
@Getter
@Setter
@SequenceGenerator(name = "PANTS_GEN", sequenceName = "PANTS_SEQ")
public class Pants {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PANTS_GEN")
    private Long id;

    @Column(name = "SIZE")
    private int size;

    @Column(name = "BRAND")
    private String brand;

}
