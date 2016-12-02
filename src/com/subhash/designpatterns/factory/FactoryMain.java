package com.subhash.designpatterns.factory;

import java.lang.reflect.Constructor;

public class FactoryMain {

    public static void main(String[] args) throws Exception {
//        Constructor<Factory> constructor = Factory.class.getDeclaredConstructor(new Class[0]);
//        constructor.setAccessible(true);
//        Factory fOne = constructor.newInstance(new Object[0]);
//        Factory fTwo = constructor.newInstance(new Object[0]);
//        System.out.println(Factory.getCount());
        
        FactoryTwo ftOne = FactoryTwo.INSTANCE;
        FactoryTwo ftTwo = FactoryTwo.INSTANCE;
        FactoryTwo ftThree = FactoryTwo.INSTANCE;
        System.out.println(ftOne);
        System.out.println(ftTwo);
        System.out.println(ftThree);        
    }
}

class Factory {
    private static Factory instance = null;
    private static int count = 0;

    private Factory() {
        count++;
    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public static int getCount() {
        return count;
    }
}