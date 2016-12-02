package com.subhash.designpatterns.strategy.steps.three;

public class MP3Music implements MusicStrategy {

    @Override
    public void playMusic() {
        System.out.println("Playing MP3 music");
    }

}
