package com.cristi.simple.spring.simplespring.hello;

import java.util.List;

import static java.util.Arrays.asList;

public class SmartTV extends TV {
    public void watchNetflix() {
        System.out.println("Watching netflix...");
    }

    public SmartTV(int signal, List<String> tvChannels) {
        super(signal, tvChannels);
    }


    public static void main(String[] args) {
        TV classicTv = new TV(10, asList("PROTV, ANTENA, HBO"));
        classicTv.watchTv();
        SmartTV smartTv = new SmartTV(10, asList("PROTV, ANTENA, HBO"));
        smartTv.watchTv();
        smartTv.watchNetflix();
    }
}
