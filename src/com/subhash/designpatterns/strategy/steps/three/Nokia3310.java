package com.subhash.designpatterns.strategy.steps.three;

public class Nokia3310 extends Mobile {
    
    public Nokia3310() {
        this.callingStrategy = new StandardCalling();
    }

}
