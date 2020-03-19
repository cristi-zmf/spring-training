package com.cristi.simple.spring.simplespring.seggregation;

import java.io.InputStream;
import java.util.Scanner;

public class ReadOnlyMemory implements Memory {
    @Override
    public String read(InputStream input) {
        return new Scanner(input).nextLine();
    }

    @Override
    public void write(String memoryFragment) {
        //I am forced to use this because of not applying interface seggregation
        //principle :(
    }
}
