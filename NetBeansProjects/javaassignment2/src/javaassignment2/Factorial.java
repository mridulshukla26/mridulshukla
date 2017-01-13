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
public class Factorial {
    int num;
    Factorial(int num){
        this.num=num;
    }
     void fact(){
         int a=1;
         for(int i=2;i<=num;i++){
             a=a*i;
         }
         System.out.println("the factorial is"+a);
     }
             
}
