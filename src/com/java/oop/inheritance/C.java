
package com.java.oop.inheritance;


public class C implements B{

    @Override
    public void play() {
        System.out.println(" Print from A interface overload");
    }

    @Override
    public void playB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
