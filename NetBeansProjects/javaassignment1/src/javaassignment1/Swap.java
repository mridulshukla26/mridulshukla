/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment1;

/**
 *
 * @author mridul
 */
public class Swap {
    int x=10;
    int y=15;
    int temp;
    void swap(){
        System.out.println("numbers before swapping"+x +y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("numbers after swapping"+x +y);
    }
    
}
