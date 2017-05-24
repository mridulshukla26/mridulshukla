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
public class diamond {
    int row;
    diamond(int row){
        this.row=row;
    }
    void pattern(){
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int k=1;k<i*2;k++){
                
                    System.out.print("*");
                
            
            }
            System.out.println("");
        }
        for(int i=2;i<=row;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=(row*2)-1;k>=(i*2)-1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

