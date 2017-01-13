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
public class Swapw {
    int x=1;
    int y=2;
    void swapW(){
        System.out.println("numbers before swapping"+x+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("numbers after swapping"+x+y);
    }
           
    
}
