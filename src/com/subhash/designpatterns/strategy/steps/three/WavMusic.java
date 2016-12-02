package com.subhash.designpatterns.strategy.steps.three;

public class WavMusic implements MusicStrategy {

    @Override
    public void playMusic() {
        System.out.println("Playing WAV music");
    }
    
}
