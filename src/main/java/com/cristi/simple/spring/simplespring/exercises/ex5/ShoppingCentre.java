package com.cristi.simple.spring.simplespring.exercises.ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/*
* In order for us to faster find new pants we need to use Spring Data Jpa repositories
* to create custom methods that will search for pants by size and by brand
*
* Use com.cristi.simple.spring.simplespring.exercises.ex5.PantsJpaRepo
* to create query method names then use jpaRepo in this class to call newly implemented
* methods
*
* */
@Service
public class ShoppingCentre {
    private PantsJpaRepo jpaRepo;

    @Autowired
    public ShoppingCentre(PantsJpaRepo jpaRepo) {
        this.jpaRepo = jpaRepo;
    }

    public List<Pants> findPantsBySize(int size){
        //TODO implement me
        return Collections.emptyList();
    }
    public List<Pants> showMePantsByBrand(String brand){
        //TODO implement me
        return Collections.emptyList();
    }
}
