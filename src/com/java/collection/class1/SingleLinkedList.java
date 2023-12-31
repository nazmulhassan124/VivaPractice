/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.collection.class1;

/**
 *
 * @author Nazmul
 */
public class SingleLinkedList {
    
    
    class Node {
    String data;
    Node next;
    Node (String data){
    this.data=data;
    this.next= null;
    }
    }
    
    public void addFirst (String data){
    
    Node newNode =new Node(data);
    
//    if(head == null){
//    head= newNode;
//    return ;}
//    
//    newNode.next= head;
//    head = newNode;
    
    }
    
    public static void main(String[] args) {
        
        SingleLinkedList obj = new SingleLinkedList();
        
        
    }

    
}
