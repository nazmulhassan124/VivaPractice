
package com.java.thread;


public class ThreadClass extends Thread{
    
    int id;
    
    @Override
    public void run(){
      
        try {
//              System.out.println( " Id is : "+  id);
//               System.out.println( " Id is : "+  Thread.currentThread().getId());
                 System.out.println( "name is : "+  Thread.currentThread().getName());
            
        } catch (Exception e) {
        }
    }

    public ThreadClass(int id) {
        this.id = id;
    }
    
    
    
    
    
}
