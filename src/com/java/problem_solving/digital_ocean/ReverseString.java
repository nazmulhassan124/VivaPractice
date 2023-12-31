package com.java.problem_solving.digital_ocean;

public class ReverseString {

    public static void main(String[] args) throws IllegalAccessException {
        String s = "ABBA";

        ReverseString aaa = new ReverseString();
        
        String reverse;
        System.out.println(reverse = aaa.reverse(s));
        
        if(s.equals(reverse)){
            System.out.println("is Palindrome");
        }else{System.out.println("not Palindrome");}

    }

    public  String reverse(String in) throws IllegalAccessException {

        if (in == null) {
            throw new IllegalAccessException("Null is not valid input");
        }

        StringBuilder out = new StringBuilder();  // step 1 :
        
        char[] a = in.toCharArray();            //step 2
        for (int i = a.length - 1; i >= 0; i--) {
            out.append(a[i]);               //step 3

        }
        return out.toString();   // step 4 : builder to string 
    }
}
