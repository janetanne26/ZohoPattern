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
public class Triangle {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
      
         for(int i=1;i<=n;i++){
         for(int j=1;j<=(2*n-1);j++){
            if(i==n || i+j==n+1 || j-i==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
         }
             System.out.println("");
         }
}
}