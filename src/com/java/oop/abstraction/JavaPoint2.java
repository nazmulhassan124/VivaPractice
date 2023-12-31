
package com.java.oop.abstraction;


public interface JavaPoint2 {

void a();  
void b();  
void c();  
void d();  
    
}

abstract class B implements JavaPoint2{

 @Override
 public void a(){ System.out.println(" Class a of B");};  


 }

 class C extends B {
     
public void a(){super.a();}  
 // public void a(){System.out.println("I am a of B");}  
public void b(){System.out.println("I am b");}  
public void c(){System.out.println("I am c");}  
public void d(){System.out.println("I am d");}  
}

interface G { void play();}
interface H {void play();}

class I implements G,H {

    
    public void play() {
        System.out.println(" cild class");
    }

}
class test {
    public static void main(String[] args) {
        
        B a1 = new C();
        a1.a();
       // a1.b();
        
        JavaPoint2 a2 = new C();
        a1.a();
        
        G g = new I();
        g.play();
    }
}