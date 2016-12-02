package com.subhash.designpatterns.strategy.steps.two;

public class NokiaLumia extends Mobile implements PictureCapable, MusicSupported {

    @Override
    void call() {
        System.out.println("Calling from NokiaLumia");

    }

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with 13 MP front camera in NokiaLumia");

    }
    
    @Override
    public void playMusic() {
        System.out.println("Playing MP3 music on NokiaLumia");
        
    }

}
