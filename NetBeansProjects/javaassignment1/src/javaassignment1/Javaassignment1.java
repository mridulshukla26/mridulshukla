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
public class Javaassignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        a=10;
        b=5;
        c=a+b;
        System.out.println("the sum is"+c);
        oddeven obj=new oddeven(4);
        obj.numCheck();
        Swap obj1=new Swap();
        obj1.swap();
        Swapw sw=new Swapw();
        sw.swapW();
        Primecheck pc=new Primecheck(11);
        pc.primeCheck();
        
    }
    
}
