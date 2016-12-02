package com.subhash.designpatterns.adapter;

import java.util.Vector;

public class AdapterTest {

    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        v.add("Four");
        v.add("Five");
        
        EnumerationIterator enumIterator = new EnumerationIterator(v.elements());
        enumIterator.remove();
        while(enumIterator.hasNext()) {
            System.out.println(enumIterator.next());
        }
    }

}
