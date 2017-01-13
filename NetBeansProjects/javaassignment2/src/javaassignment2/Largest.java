/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2;

/**
 *
 * @author mridul
 */
public class Largest {
    int a,b,c;
    Largest(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void large(){
        if(a>b&&a>c){
            System.out.println("largest is"+a);
        }
        else if(b>a&&b>c){
            System.out.println("largest is"+b);
        }
        else{
            System.out.println("largest is"+c);
        }
    }
            
}
