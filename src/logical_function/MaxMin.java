/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical_function;

import java.util.Scanner;

/**
 *
 * @author Nazmul
 */
public class MaxMin {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input Length : ");
      //  System.out.println("");
        int length= input.nextInt();
        int arr[]= new int[length];
        
        
        for (int i = 0; i <length; i++) {
            arr[i]= input.nextInt();
        }
        
        //Max Number
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
            max=arr[i];
            }
        }
        System.out.println("Max number is: " + max);
        
        //Min number
        int min= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i]){
            min=arr[i];
            }
        }
        System.out.println("Min number is : "+ min);
        
        
        // Booble short
        
        int temp;
        
        for (int i = 0; i <arr.length; i++) {
            
            for (int j = 1; j < arr.length; j++) {
                
                if(arr[j-1]>arr[j]){
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                }
            }
            
            
            
        }
        
        
        
        for (int a: arr){
            System.out.print(a + ",");
        }
        
    }
    
    
}
