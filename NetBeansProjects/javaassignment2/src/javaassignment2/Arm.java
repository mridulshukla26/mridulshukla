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
public class Arm {
    int num;
    Arm(int num){
        this.num=num;
    }
    void arm(){
        int a=0,rem,c=num;
       
        while(num>0){
            rem=num%10;
            a=a+rem*rem*rem;
            num=num/10;
        }
        if(a==c){
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("the number is not armstrong");
    }}
}
