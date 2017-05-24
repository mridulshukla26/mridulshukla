/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment3;

/**
 *
 * @author mridul
 */
public class Palindrome {
    int num;
    Palindrome(int num){
        this.num=num;
    }
    void pali(){
        int rem,sum=0,c=num;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(c==sum){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}
