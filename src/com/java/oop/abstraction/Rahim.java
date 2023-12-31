
package com.java.oop.abstraction;


public class Rahim  extends MobileUser{

    @Override
    void sendMessage() {
        System.out.println("Hi Rahim");
        }
    
    }
    



class Karim extends MobileUser{

    @Override
    void sendMessage() {
        System.out.println("Hi Karim");
        
    }
    
    
   @Override
    void call (){
     //   super.call();       // super class call
        System.out.println("This is non abastract sub calss");
        
        
}
    
// void call (){
//       super.call();       // child method theke super class call
//        
//}
  
}