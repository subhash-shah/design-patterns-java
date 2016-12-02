package com.subhash.designpatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<String> {
    
    Enumeration<String> enumerator;
    
    public EnumerationIterator(Enumeration<String> enumerator) {
        this.enumerator = enumerator;
    }

    @Override
    public boolean hasNext() {
        return enumerator.hasMoreElements();
    }

    @Override
    public String next() {
        return enumerator.nextElement();
    }

    @Override
    public void remove() {
        System.err.println("Unsupported operation");
    }
    

}
