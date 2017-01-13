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
public class Primecheck {
    int num=5;
    Primecheck(int num){
        this.num=num;
    }
            void primeCheck(){
                for(int i=2;i<num;i++){
                    if(num%i==0)
                        System.out.println("the number is not prime");
                break;
                               
            }
                System.out.println("the number is prime");
            }
}
