
package com.java.oop.inheritance;


public class Teacher extends Persion{
    
    public String qualification ;
    
   
    
    public void child (String n, String e, String q){
        parent(n, e);
         qualification = q;
         System.out.println(" Qalification : " + q);
    }
}
