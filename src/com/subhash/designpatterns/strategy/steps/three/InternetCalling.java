package com.subhash.designpatterns.strategy.steps.three;

public class InternetCalling implements CallingStrategy {

    @Override
    public void call() {
        System.out.println("InternetCalling");
    }

}
