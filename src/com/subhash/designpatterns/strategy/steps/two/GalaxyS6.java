package com.subhash.designpatterns.strategy.steps.two;

public class GalaxyS6 extends Mobile implements PictureCapable, MusicSupported {

    @Override
    void call() {
        System.out.println("Calling from GalaxyS6");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with 8 MP front camera in GalaxyS6");
    }
    
    @Override
    public void playMusic() {
        System.out.println("Playing WAV music file on GalaxyS6");
    }

}
