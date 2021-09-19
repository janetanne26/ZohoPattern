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
public class RightPascal {
    public static void main(String[] args) {   
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //second part
        for(int i=n-1;i>=1;i--){
            for(int j=n-1-i;j>=1;j--){
                System.out.print("");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
}
}