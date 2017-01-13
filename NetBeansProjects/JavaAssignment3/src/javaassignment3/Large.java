/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment3;

/**
 *
 * @author mridul
 */
public class Large {
    int a,b,c;
    Large(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void large(){
        int l,x;
        l=(a>b)?a:b;
        x=(l>c)?l:c;
        System.out.println("the largest is"+x);
    }
    
}
