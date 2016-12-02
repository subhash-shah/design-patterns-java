package com.subhash.designpatterns.strategy.steps.two;

public class IPhone extends Mobile implements MusicSupported, PictureCapable {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with 13 MP front camera in IPhones");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing MP3 music on IPhone");
        
    }

    @Override
    void call() {
        System.out.println("Calling from IPhone");
    }

}
