package com.java.collection.class1;

public class BinarySearchPractice {

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 8, 12, 13, 17, 19, 20, 24, 26, 28, 30, 32, 35, 40, 45, 50, 52, 57, 60};

        int search = 40;
        int li = 0;
        int hi = arr.length - 1;

        int mid = (li + hi) / 2;
        while (li <= hi) {
            if (arr[mid] == search) {
                System.out.println("Your result "+ arr[mid]+" found in  " + mid + " index");
                break;
            }else if (arr[mid] < search){
            li= mid+1;
            }else {
            hi= mid-1;
            }
        mid = (li+hi)/2;

    }
        if(li>hi){
            System.out.println("element not found");}

}
}