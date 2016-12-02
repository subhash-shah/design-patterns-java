package com.subhash.designpatterns.strategy.steps.three;

public class NokiaLumia extends Mobile {
    
    public NokiaLumia() {
        this.callingStrategy = new InternetCalling();
        this.pictureStrategy = new EightMPCamera();
        this.musicStrategy = new WavMusic();
    }
    
    public void takePhoto() {
        pictureStrategy.takePhoto();
    }
    
    public void playMusic() {
        musicStrategy.playMusic();
    }
}
