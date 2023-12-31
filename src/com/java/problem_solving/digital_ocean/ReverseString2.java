
package com.java.problem_solving.digital_ocean;


public class ReverseString2 {
    public static void main(String[] args) {
        
        String ss= "ABBA";
        System.out.println( reverse(ss));
        
        
    }
    public static String reverse(String in){
        
        if(in==null){throw new IllegalArgumentException(" Null is not valid");}
        
        StringBuffer sb = new StringBuffer();
         
        char [] cc= in.toCharArray();
        for (int i = cc.length-1; i >= 0; i--) {
            sb.append(cc[i]);
        }
      String a= sb.toString();
      
        if(a.equals(in)){
        return "palindrom";
        }
        System.out.println(a+","+ in);
        
    return "not palindrom";
    }
    
}
