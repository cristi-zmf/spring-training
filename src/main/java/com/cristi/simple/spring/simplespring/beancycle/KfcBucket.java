package com.cristi.simple.spring.simplespring.beancycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class KfcBucket {
    private List<String> bucketContent = Arrays.asList("crispy", "wing", "hot booster", "twister");

    @Autowired
    public KfcBucket() {
        bucketContent = new ArrayList<>(bucketContent);
        System.out.println("I am gonna enjoy that bucket...");
        bucketContent.remove("crispy");
        bucketContent.remove("wing");
        System.out.println("Pff i cant finish the bucket!!! :(");
        System.out.println("I still have left: " + bucketContent);
    }

    @PreDestroy
    public void eatThatBucket() {
        System.out.println("I am not gonna leave my luck on the plate!!");
        System.out.println("I am gonna eat everything: ");
        System.out.println("I still have: " + bucketContent);
        bucketContent.clear();
        System.out.println("There, I destroyed this bucket!!!");
    }

    @PreDestroy
    public void whatever() {
        System.out.println("Do something before destroying myself");
    }
}
