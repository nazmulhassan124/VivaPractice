
package com.java.oop.encapsulation;


public class LoopPractice {
   
    public static void main(String []args ){
    
        
    // For loop    
        System.out.println("For Loop");
    int n=80;
    double sum= 0;
    
    for (int i=2;i<=80; i=i+2 ){
      //  sum =+sum +(i*i);
        sum =+ sum + Math.pow(i,2);
        
        System.out.println(" I = "+ i +" ,  "+ "Summation " + " = "+ sum);}
    
    
    
    // do While
        System.out.println("Do While Loop");
    
    int sum2=0;
    int i=2;
    
    do{
        System.out.print(" I = "+ i );
        
        sum2 =+ sum2+(i*i); i=i+2;
       
         System.out.println( ", Summation " + " = "+ sum2);
            
    
    } while(i<=n);
            
    }
}
