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
public class pattern1 {
    int row;
    pattern1(int a){
        row=a;
    }
    void pattern(){
        int i,j,k;
        for(i=1;i<=row;i++){
            for(j=i;j<row;j++){
                System.out.print(" ");
            }
            for(k=1;k<i*2;k++){
                
                    System.out.print("*");
                
            
            }
            System.out.println("");
        }
    }
}
