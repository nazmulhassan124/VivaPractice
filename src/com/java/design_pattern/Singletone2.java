

/*  Syncronized na hoai Different thread hole dui bar call hoi.. ja songle tobe er uddesso sofol kore nah

tai syncronize korle different thread holew akbar obj create hobe.
*/
package com.java.design_pattern;

/* Syncronized*/
public class Singletone2 {
     
    public static void main(String[] args) {
         
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                AA a1 = AA.getinstance();
                  a1.messange();
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                AA a2 = AA.getinstance();
                  a2.messange();
            }
        });
        
        t1.start();
        t2.start();
    }
    
}

class AA {
    private static AA instance;
   private AA (){
       System.out.println("Constractor");  // instance kebol akbar hoai contractor akbar call hobe
   }
   
   public static synchronized AA getinstance(){
   if(instance == null){
   return instance = new AA();
   }
   return instance;
   }

   public void messange (){
       System.out.println("Syncronized");
   }
   
}
