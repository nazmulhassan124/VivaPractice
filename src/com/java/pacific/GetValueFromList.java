/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.pacific;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class GetValueFromList {
    public static void main(String[] args) {
        
        Student s1 = new Student("Nazmul", 12);
Student s2 = new Student("Rahim", 24);
Student s3 = new Student("Karim", 36);
List<Student> studentList = Arrays.asList(s1, s2, s3);
        
        for (int i = 0; i < studentList.size() ; i++) {
            Student element = studentList.get(i);
            if(element !=null && element.getName().equalsIgnoreCase("karim")) {
	  System.out.println( i + " " + element.getName());
				} 
        }
        
    }
    
}

class Student {
    public String name;
    public int age;
    
    public String getName (){
    return this.name;
    }
    public void setName (String name){
     this.name= name;
    }
    
    public int getAge (){
    return this.age;
    }
    public void setAge (int age){
     this.age= age;
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}