
package logical_function;

import java.util.ArrayList;


public class FactorialNumber {
    
    public static void main(String[] args) {
        
        int num=5;
        int sum1=0;
        
        for (int i = 1; i <=num; i++) {
          
            sum1 *= i;
            
        }
        
       
        
         int len =5;
   
         int [] arr= new int [len];
         ArrayList arr2 = new ArrayList(len);
    
    int sum=1;
    
        for (int i = 1; i <= len; i++) {
            sum *= i;
           arr[i-1]= sum;
            arr2.add(i-1,sum);
           
            
        }
        
        System.out.println(arr2);
        for (int i = 0; i <arr.length; i++) {
              System.out.print(arr[i] +",");
           
        }
        System.out.println("");
        System.out.println( sum);
     
       
    }
    
    
    
}
