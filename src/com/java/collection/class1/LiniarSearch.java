
package com.java.collection.class1;

import java.util.ArrayList;


public class LiniarSearch {
    
    
    public static void main(String[] args) {
        
        int arr[]={5,8,12,15,17,18,19,30,25,28,30};
       
        int search = 30;
        int temp=0;
        ArrayList arr2 = new ArrayList();
        
        for(int i=0; i<arr.length; i++){
        
        if(arr[i]==search){
            System.out.println("Your search item found in  " + i +"  index");
            temp ++;
            arr2.add(i);
            
        }
        
        }
         if(temp<1){
            System.out.println("Item not Found");
        }
        
        System.out.println(arr2);
        
        
    }
    
}
