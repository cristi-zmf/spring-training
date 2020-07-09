package com.cristi.simple.spring.simplespring.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Smartphones extends JpaRepository<Smartphone, Long> {

    List<Smartphone> findByBrandIgnoreCase(String brand);

}
