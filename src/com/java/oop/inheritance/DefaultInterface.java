package com.java.oop.inheritance;

public class DefaultInterface implements AA,BB {

    @Override
  public  void play(){System.out.println(" this is immplementation of interface");}
  
  
    @Override
  public void description(){  AA.super.description();};
  
  public static void main (String args[]){
  
  DefaultInterface d = new DefaultInterface();
  d.play();
  d.description();
  }
  
}

interface AA {
default  void description (){System.out.println(" AA default method ");}
    void play();
}

interface BB {
default  void description (){System.out.println(" BB default method ");}
    void play();
}
