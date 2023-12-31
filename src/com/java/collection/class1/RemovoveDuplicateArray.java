
package com.java.collection.class1;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemovoveDuplicateArray {
    
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,4,5,5,5};
        Set<Integer> s = new LinkedHashSet();
        
        int j=0;
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i]!= arr[i+1]){
            arr[j]=arr[i];
            j++;
                          }
        }
          System.out.print(j);

        System.out.println("");
        
         arr[j]=arr[arr.length-1];
        for (int i = 0; i < j+1; i++) {
             System.out.print(arr[i] +" ,");
        }
        
    }
    
}
