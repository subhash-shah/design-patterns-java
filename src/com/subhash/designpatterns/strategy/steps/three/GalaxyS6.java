package com.subhash.designpatterns.strategy.steps.three;

public class GalaxyS6 extends Mobile {
    
    public GalaxyS6() {
        this.callingStrategy = new InternetCalling();
        this.pictureStrategy = new PictureStrategy() {
            
            @Override
            public void takePhoto() {
                System.out.println("Taking picture using 13 MP camera");
            }
        };
        this.musicStrategy = new MP3Music();
    }
    
    public void takePhoto() {
        pictureStrategy.takePhoto();
    }
    
    public void playMusic() {
        musicStrategy.playMusic();
    }
}
