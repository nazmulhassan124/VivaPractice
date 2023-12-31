
package logical_function;


public class PrimeNumber {
    
    public static void main(String[] args) {
        int num= 58;
        int a=0;
        
        for (int i = 2; i < num; i++) {
            
            if(num%i==0){
                a++;
            } 
            
        }
        if(a>0){
            System.out.println("not prime");
        }else{ System.out.println(" prime");}
     
        
          
  
    }
    
    
  
    
    
    
}
