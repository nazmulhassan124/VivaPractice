
package com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CharacterStream {
    
    public static void main(String[] args) {
        
        String path ;
        
        try {
            FileWriter writter = new FileWriter("F:/Practice/Core Java/Java IO/CharacterFile.txt");
            BufferedWriter buffer = new BufferedWriter(writter);
            buffer.write("bufferd writer");
            buffer.close();
            
            
             System.out.println("Success");  
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        //Read file
        
        try {
            FileReader reader = new FileReader("F:/Practice/Core Java/Java IO/CharacterFile.txt");
            BufferedReader br = new BufferedReader(reader);
            
            int i =0;
            
            while ((i=br.read())!=-1){
                System.out.print((char)i);
            }
               br.close();    
          reader.close();  
            
            
        } catch (Exception e) {
             System.out.println(e);
        }
        
        System.out.println("");
        
         InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter your name");    
    String name="";    
        try {
            name = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(CharacterStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.out.println("Welcome "+name);    
        
        
    }
    
}
