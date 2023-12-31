
package logical_function;


public class FactorialNumberList {
    public static void main(String[] args) {
        
        int len=5;
        int sum=1;
        for (int i = 1; i <=len; i++) {
            sum*= i;
            System.out.print(sum+ " , ");
        }
        System.out.println("");
        System.out.println(sum);
        
    }
    
}
