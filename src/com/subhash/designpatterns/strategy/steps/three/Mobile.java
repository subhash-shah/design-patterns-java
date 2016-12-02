package com.subhash.designpatterns.strategy.steps.three;

public abstract class Mobile {
    
    CallingStrategy callingStrategy;
    MovieStrategy movieStrategy;
    PictureStrategy pictureStrategy;
    MusicStrategy musicStrategy;
    
    public void call() {
        callingStrategy.call();
    }

    public CallingStrategy getCallingStrategy() {
        return callingStrategy;
    }

    public void setCallingStrategy(CallingStrategy callingStrategy) {
        this.callingStrategy = callingStrategy;
    }

    public MovieStrategy getMovieStrategy() {
        return movieStrategy;
    }

    public void setMovieStrategy(MovieStrategy movieStrategy) {
        this.movieStrategy = movieStrategy;
    }

    public PictureStrategy getPictureStrategy() {
        return pictureStrategy;
    }

    public void setPictureStrategy(PictureStrategy pictureStrategy) {
        this.pictureStrategy = pictureStrategy;
    }

    public MusicStrategy getMusicStrategy() {
        return musicStrategy;
    }

    public void setMusicStrategy(MusicStrategy musicStrategy) {
        this.musicStrategy = musicStrategy;
    }
    
}
