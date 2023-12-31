package com.java.design_pattern;

public class SingleTone {

    public static void main(String[] args) {
        
        A a = A.getinstace();
        a.doSomething();

        B b =B.getins();
        b.getMessage();
        
    }

}



class A {

    /*Early Instantiation   Progaram run hoar somoi e memory te instance create hoa jai*/
    
    private static A instance = new A();   // static hoai akbar e instance create hobe

    private A() { }  // make constractor private 

   public static  A getinstace() {
        return instance;
    }
   // for global access

    public void doSomething() {
        System.out.println("Early Instanstiation");
    }

}


class B {
  /*Lazy Instantiation   User er firs call  e memory te instance create hoa jai*/
    
    private static B instance;
    
    private B (){}
    
    public static B getins(){
    
       if(instance==null){
       return instance = new B();
       }
       return instance;
    }
    
    public void getMessage (){
    
        System.out.println("Lazy Instantiation ");
    }

}
