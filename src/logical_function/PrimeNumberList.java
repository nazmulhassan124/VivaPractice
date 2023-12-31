

package logical_function;

import java.util.ArrayList;


public class PrimeNumberList {
    
    public static void main(String[] args) {
        
        int num=100;
        int count=0;
        
        int temp=0;
        
        for (int i = 2; i <= num; i++) {
            
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    temp++;
                }
                 
            }
              if(temp<1) { 
               
                    System.out.print(i +",");
                   count++;
                    
                }else{
               temp = 0;
              }
            
        }
        System.out.println("");
        System.out.println("Total Prime number :"+ count);
        
        
    }
    
}
