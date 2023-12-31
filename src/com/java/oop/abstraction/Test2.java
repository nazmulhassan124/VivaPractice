
package com.java.oop.abstraction;


public class Test2 {
    
    
    public static void main(String []args){
        
        MobileUser mu;    // supper class refference
        mu = new Rahim();
        mu.sendMessage();
        mu.call();  // call super class method
        
        mu = new Karim();
        mu.sendMessage();
          mu.call();   // sub class method  
          
        //(  same refferce but er modde different method rakha hocce tai run time ditect 
        // hocce  kon  method call hobe.... atai RUn time plolymorphism method Override)
        
     
    }
    
    
    
}
