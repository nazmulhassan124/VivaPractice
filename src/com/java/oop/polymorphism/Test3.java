
package com.java.oop.polymorphism;


public class Test3 {
    
    public static void main(String[] args) {
       Person p = new Person(); 
       p.display();
       
       p= new Student();
       p.display();
       
       p= new Teacher();
       p.display();
               
       /*  Same Refference but differnt object rakhai differnt Behavior .. this cald runtime Polymorphism
       Or method Override
       */
    }
    
   
    
}
