
package logical_function;

import java.util.Scanner;


public class GradeSystem {
    
    
    public static void main(String[] args) {
        
        System.out.print("Input a number :");
        Scanner input = new Scanner(System.in);
        
       int num= input.nextInt();
       
        System.out.println("");
        
        
        
        
       if(  num <33){
           System.out.println("Fail");
       
       }else if(num>=33 &&  num <40){
            System.out.println("E");
            
       }else if(num>=40&&  num <50){
            System.out.println("C");
            
       }else if(num>=50&&  num <60){
            System.out.println("B");
            
       }else if(num>=60&&  num <70){
            System.out.println("A");
            
       }else if(num>=70&&  num <80){
            System.out.println("A-");
            
       }else {
             System.out.println("A+");
       }
        
        
        
    }
    
    
}
