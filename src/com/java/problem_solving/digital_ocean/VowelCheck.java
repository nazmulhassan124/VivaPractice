
package com.java.problem_solving.digital_ocean;


public class VowelCheck {
    public static void main(String[] args) {
        
        
        System.out.println(Vcheck("bcdfgh"));
         System.out.println(Vcheck("Hassan"));
        
        
    }
    
    public static boolean Vcheck(String input){
    
       
        
       return input.toLowerCase().matches(".*[aeiou].*");
    }
    
}
