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
public class Javaassignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factorial f1=new Factorial(5);
        f1.fact();
        Reverse r1=new Reverse(543);
        r1.rev();
        Fibo f2=new Fibo(5);
        f2.fibo();
        Arm a1=new Arm(153);
        a1.arm();
        Largest l1=new Largest(10,4,6);
        l1.large();
    }
    
}
