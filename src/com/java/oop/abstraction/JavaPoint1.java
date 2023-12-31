
package com.java.oop.abstraction;


public class JavaPoint1 {
    
}



 abstract class Bike{  
     
   Bike(){System.out.println("bike is created");}    // Constractor
 
   abstract void run();  
   
   void changeGear(){System.out.println("gear changed");}
   
 }  


 class Honda extends Bike{  
     
 @Override
 void run(){System.out.println("running safely..");}  
 }  


 class TestAbstraction2{  
     
 public static void main(String args[]){  
     
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  
