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
public class Reverse {
    int num;
    Reverse(int num){
        this.num=num;
    }
    void rev(){
        int rem,sum=0;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println("the reverse of the number is"+sum);
    }
            
}
