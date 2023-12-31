
package logical_function;

import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main ( String []args){
    
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Integer :");
        int len= Integer.parseInt(in.nextLine());
      
        // By for loop
        
        System.out.println("");
        int a=0;
        System.out.print(a+",");
        int b=1;
        System.out.print(b+",");
        
        int temp=0;
        for (int i = 0; i<=len; i++) {
            temp=a+b;
            
            System.out.print(temp +",");
           a=b;
           b=temp;
           
           
            
        }
    
    
    
    }
    
}
