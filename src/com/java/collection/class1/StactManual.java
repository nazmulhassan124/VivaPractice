package com.java.collection.class1;

public class StactManual {

    int capacity = 3;
    int[] stack = new int[capacity];
    int top = -1;

    void push(int x) {
        
        if(top < capacity-1){    // top -1 dekhe capacity theke 1 munus
        top = top+1;    //0
        stack[top]= x;     //[0=x, 1,2]  [0,1=x,2],[0,1,2=x]
        
            System.out.println("Successfully added " + x);
        }else{System.out.println("Stack Over Flow");}

    }

    int peek() {
        
        if(top<0){
            System.out.println("Stack UnderFlow");
            return -1;
        }else{
        return stack[top];
        }
        
    }
    
     int pop() {
        
        if(top<0){
            System.out.println("Stack UnderFlow");
            return -1;
        }else{
        int val= stack[top];
        top = top -1;
        
        return  val;
        }
        
    }

}

class Test{


    public static void main(String[] args) {
        
        StactManual  ss = new StactManual();
        System.out.println("peek return  " +  ss.peek());
        ss.push(10);
        ss.push(20);
        ss.push(30);
             System.out.println("pop deleted" +  ss.pop());
             System.out.println("third index" + ss.stack[2]);
        ss.push(40);
         System.out.println("third index" + ss.stack[2]);
      System.out.println("peek return " +  ss.peek());
        
    }
}
