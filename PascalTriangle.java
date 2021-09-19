/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zohopattern;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PascalTriangle {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            //spaces
           for(int j=i;j<=n;j++){
               System.out.print(" ");
                
            }
           //number
           int num=1;
           for(int k=0;k<=i;k++){
               System.out.print(num+" ");
               num=num*(i-k)/(k+1);
           }
            System.out.println("");
        }
    }
    
}
