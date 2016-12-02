package com.subhash.designpatterns.strategy.steps.three;

public class IPhone extends Mobile {
    
    public IPhone() {
        this.callingStrategy = new InternetCalling();
        this.pictureStrategy = new PictureStrategy() {
            
            @Override
            public void takePhoto() {
                System.out.println("Taking picture using 21 MP camera");
            }
        };
        this.musicStrategy = new MP3Music();
        this.movieStrategy = new MovieStrategy();
    }
    
    public void takePhoto() {
        pictureStrategy.takePhoto();
    }
    
    public void playMovie() {
        movieStrategy.playMovie();
    }
    
    public void playMusic() {
        musicStrategy.playMusic();
    }
    
}
