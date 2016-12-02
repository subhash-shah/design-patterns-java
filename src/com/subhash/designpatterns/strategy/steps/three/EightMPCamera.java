package com.subhash.designpatterns.strategy.steps.three;

public class EightMPCamera implements PictureStrategy {

    @Override
    public void takePhoto() {
        System.out.println("Taking picture with 8 MP camera");
    }

}
