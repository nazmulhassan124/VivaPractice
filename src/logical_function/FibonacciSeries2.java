
package logical_function;

import java.util.Scanner;


public class FibonacciSeries2 {
    
    public static void main ( String args[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Fibonacci length :");
        int len = sc.nextInt();
        
        int a= 0;
         int b= 1;
          int temp;
         System.out.print(a+","+b+",");
          
         for(int i=0; i<=len; i++){
          temp = a+b;
             System.out.print(temp+",");
             a=b;
             b=temp;
         }
        
        
    }
    
}
