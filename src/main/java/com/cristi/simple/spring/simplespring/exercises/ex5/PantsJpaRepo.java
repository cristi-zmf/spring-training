package com.cristi.simple.spring.simplespring.exercises.ex5;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PantsJpaRepo extends JpaRepository<Pants, Long> {
    List<Pants> findBySize(int size);
    List<Pants> findByBrandContainingIgnoreCase(String brand);
}
