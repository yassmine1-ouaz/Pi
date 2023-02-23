/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Mohamed
 */
public class A {
   static A instance;
    private  A(){
        
    }
    public static A getInstance(){
    if (instance== null){
        instance = new A();
    }    
    return instance;
    }
}
