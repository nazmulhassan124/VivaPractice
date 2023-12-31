package com.java.design_pattern;

public class DoubleCheckLocking {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                D obj = D.getinstance();
                obj.messange();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                D obj = D.getinstance();
                obj.messange();
            }
        });

        t1.start();
        t2.start();

    }
}

class D {

    private static D instance;

    private D() {
        System.out.println("Constractor");
    }

    public static D getinstance() {
        if (instance == null) {

            synchronized (D.class) {      // full method ke syncronized na kore block ke korle fast hoi..
                if (instance == null) {
                    return instance = new D();
                }

            }

        }
        return instance;
    }

    public void messange() {
        System.out.println("Syncronized");
    }

}
