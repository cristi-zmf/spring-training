package com.cristi.simple.spring.simplespring.tdd;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StringCalculator {
    static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String customDelimiter = "";
        if (numbers.startsWith("//")) {
            // am luat //;\n
            String delimiterMetadata = numbers.substring(0, 3);
            // am sters din numbers primele 4, astfel incat sa raman numai cu numere, adica //;//1;2 o sa devina 1;2
            numbers = numbers.substring(4);
            customDelimiter = delimiterMetadata.substring(2,3);
        }


        //Regular Expressions
        String delimiterRegex = ",|\n";
        if (!customDelimiter.isEmpty()) {
            delimiterRegex = delimiterRegex + "|" + customDelimiter;
        }

        String[] splitNumbers = numbers.split(delimiterRegex);
        String concatenatedNegativeNumbers = Arrays.stream(splitNumbers)
                .filter(s -> s.startsWith("-"))
                .collect(joining(","));

        if (!concatenatedNegativeNumbers.isEmpty()) {
            throw new IllegalStateException("negatives not allowed: " + concatenatedNegativeNumbers);
        }

        return Arrays.stream(splitNumbers)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
