
package com.java.thread;


public class ThreadTestMain {
    
    public static void main(String[] args) {
        
       
        
        for(int i =1; i<=10;i++){
             ThreadClass a1 = new ThreadClass(i);
             a1.start();
             
             Thread b1 = new Thread (new ThreadInterface());
             
         
             
             b1.start();
             
         
        }
       
        
    }
          
    
}
