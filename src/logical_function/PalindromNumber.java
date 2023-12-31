
package logical_function;

public class PalindromNumber {
    
    public boolean palindrom(int x){
        
        int temp = x;
        int reverse=0;
        int remainder;
        
        while(temp!=0){
            
        remainder= temp%10;
        reverse=reverse*10+remainder;
        temp=temp/10;
        }
         if(reverse==x){
        return true;
        }else{
        return false;
                }
        
       
        
}
    public static void main(String[] args) {
        PalindromNumber p = new PalindromNumber();
        System.out.println( p.palindrom(-121));
        
    }
    
}
