
package com.java.collection.class1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class RemoveDuplicateCollection {
    public static void main(String[] args) {
        
         int[] arr= {1,2,2,3,4,5,5,5};
         
         Set<Integer> ss = new HashSet ();
         
         for (int i = 0; i<arr.length; i++) {
             ss.add(arr[i]);
            
        }


         
         Iterator ii = ss.iterator();
         while( ii.hasNext()){
         Object value = ii.next();
             System.out.print(value+ " , ");
         }
    }
    
    
}
