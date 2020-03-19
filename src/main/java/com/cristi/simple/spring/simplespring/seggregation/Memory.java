package com.cristi.simple.spring.simplespring.seggregation;

import java.io.InputStream;

public interface Memory {
    String read(InputStream input);
    void write(String memoryFragment);
}
