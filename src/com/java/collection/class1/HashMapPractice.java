
package com.java.collection.class1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapPractice {
    
    public static void main ( String[] args){
        
       //Map
       
       
       Map<Integer,String> mc  = new HashMap ();
       
       mc.put(101, "Nazmul");
       mc.put(102, "hassan");
       mc.put(103, "Nishi");
       mc.put(104, "Depak");
       
        //System.out.println(mc);
        
      Set set =  mc.entrySet();
      
        //  System.out.println(set);
          
         Iterator itr =set.iterator();
         while(itr.hasNext()){
           //  System.out.println(itr.next());
          Map.Entry entry= (Map.Entry) itr.next();
          
             System.out.println(entry.getKey() + "->"+ entry.getValue());
           
         }
         
         //Using For loops
         
         for(Map.Entry me : mc.entrySet() ){
         
             System.out.println(me.getValue());
         }
       
    }
    
}
