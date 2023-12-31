
package logical_function;


public class BoobleShort {
    
    public static void main(String[] args) {
        
        int [] arr= {5,10,16,20,7,22};
        int temp;
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1]<arr[j]){
               temp= arr[j-1];
               arr[j-1]=arr[j];
               arr[j]=temp;
               
                
                }
                
            }
           
            
        }
        
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+",");
            
        }
        
    }
    
}
