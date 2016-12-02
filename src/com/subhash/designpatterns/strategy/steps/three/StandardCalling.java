package com.subhash.designpatterns.strategy.steps.three;

public class StandardCalling implements CallingStrategy {

    @Override
    public void call() {
        System.out.println("StandardCalling");
    }

}
