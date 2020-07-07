package com.cristi.simple.spring.simplespring.hello;

import java.util.List;

public class TV {
    private int signal;
    private List<String> tvChannels;

    public TV(int signal, List<String> tvChannels) {
        this.signal = signal;
        this.tvChannels = tvChannels;
    }


    public void watchTv() {
        //JAVA 8
        tvChannels.forEach(tvChannel -> System.out.println(tvChannel));
    }
}
