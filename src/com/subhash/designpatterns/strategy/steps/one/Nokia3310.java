package com.subhash.designpatterns.strategy.steps.one;

public class Nokia3310 extends Mobile {

    @Override
    void call() {
        System.out.println("Calling from Nokia 3310");
    }

    @Override
    void takePhoto() {
        System.err.println("Taking photo is not supported");
    }

    
}
