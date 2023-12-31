
package com.java.thread;


public class ThreadInterface implements Runnable{

    @Override
    public void run() {
        
        
          try {
//             
                 System.out.println( "name is : "+  Thread.currentThread().getId());
            
        } catch (Exception e) {
        }
        
      
    }
    
}
