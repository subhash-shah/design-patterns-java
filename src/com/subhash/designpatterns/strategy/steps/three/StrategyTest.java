package com.subhash.designpatterns.strategy.steps.three;

public class StrategyTest {

    public static void main(String[] args) {
        
        IPhone phone = new IPhone();
        phone.playMusic();
        phone.setMusicStrategy(new MusicStrategy() {
            
            @Override
            public void playMusic() {
                System.out.println("Playing MP4 files happily.");
            }
        });
        phone.playMusic();

    }

}
