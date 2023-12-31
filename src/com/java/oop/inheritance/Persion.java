
package com.java.oop.inheritance;


public class Persion {
    public String name;
    public String email;
   
    
    
    public void parent ( String name , String email){
    this.name= name;
    this.email= email;
    
        System.out.println(" from parendt" + "name :" + name+ " Email : " + email);
    }
}
