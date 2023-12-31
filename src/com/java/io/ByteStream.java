package com.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {

    public static void main(String[] args) {

        //File write
        String s = "My name is Nazmul";
        byte i[] = s.getBytes();

        try {
            FileOutputStream fot = new FileOutputStream("F:/Practice/Core Java/Java IO/TestFile.txt", true);
            // true dile ager datar sathe append hobe
            String ss = javax.swing.JOptionPane.showInputDialog(null, "Enter text");
            byte bb[] = ss.getBytes();

            fot.write(bb);
            fot.close();

        } catch (Exception e) {
        }
        // File Read   First process
        try {

            FileInputStream fin = new FileInputStream("F:/Practice/Core Java/Java IO/TestFile.txt");

            int j = 0;

            while ((j = fin.read()) != -1) {
                System.out.print((char) j);

            }

            fin.close();
        } catch (Exception e) {
        }

        // File Read   Second process
        System.out.println("");
        try {

            FileInputStream fin2 = new FileInputStream("F:/Practice/Core Java/Java IO/TestFile.txt");

            while (true) {
                int k = fin2.read();

                if (k == -1) {
                    break;
                }
                System.out.print((char) k);
            }

            fin2.close();
        } catch (Exception e) {
        }

    }

}
