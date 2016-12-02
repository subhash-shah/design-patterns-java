package com.subhash.designpatterns.strategy.steps.one;


public class GalaxyS6 extends Mobile {

    @Override
    void call() {
        System.out.println("Calling from GalaxyS6");
    }

    public void takePhoto() {
        System.out.println("Taking photo with 8 MP front camera in GalaxyS6");
    }

}
