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
public class JavaAssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Large l1=new Large(4,65,15);
        l1.large();
        Palindrome p1=new Palindrome(111);
        p1.pali();
        pattern1 p=new pattern1(5);
        p.pattern();
        pattern2 p2=new pattern2(5);
        p2.pattern();
        diamond d=new diamond(5);
        d.pattern();
        // TODO code application logic here
    }
    
}
