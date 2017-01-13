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
public class Fibo {
    int limit;
    Fibo(int num){
        limit=num;
    }
    void fibo(){
        int a=1;
        int b=1;
        int c=a+b;
        System.out.println("series is"+a+b+c);
        for(int i=1;i<limit;i++){
            c=c+i;
            System.out.println(+c);
        }
        
    }
}
