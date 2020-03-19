package com.cristi.simple.spring.simplespring.kiss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Comparator.naturalOrder;
import static java.util.stream.Collectors.toList;

public class SimpleExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrei", "Ion", "Petre", "Doby", "Jon", "Razvan", "Cezar");
        //vrem numele cu peste 4 caractere
        //sortate lexicografic
        // care contin litera a
//        Predicate<String> moreThan4Chars = s -> s.length() > 4;
//        Predicate<String> containsLetterA = s -> s.contains("a");
//        List<String> filteredNames = names.stream()
//                .filter(moreThan4Chars.and(containsLetterA))
//                .sorted()
//                .collect(toList());
//        System.out.println(filteredNames);

        /*
        Filters names with over 4 chars that contain letter a
        and then sort them in natural order
        */
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            boolean moreThan4Chars = false;
            boolean containsLetterA = false;
            if (name.length() > 4) {
                moreThan4Chars = true;
            }
            if (name.contains("a")) {
                containsLetterA = true;
            }
            if (moreThan4Chars && containsLetterA) {
                filteredNames.add(name);
            }
        }
        filteredNames.sort(naturalOrder());
        System.out.println(filteredNames);
    }
}
