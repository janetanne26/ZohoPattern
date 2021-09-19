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

public class NumberDiamond {
    public static void main(String[] args) {
        
    
   Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            int count=0;
            int temp=i;
           for(int j=i;j<n;j++){
               System.out.print(" ");
           }
        
        //printing nos
        for(int k=1;k<=2*i-1;k++){
            System.out.print(temp);
            if(temp>1&&count==0){
                temp--;
            }
            else{
                temp++;
                count=1;
            }
        }
            System.out.println("");
        }
        
        //second part
         for(int i=n-1;i>=1;i--){
            int count=0;
            int temp=i;
           for(int j=n-i-1;j>=0;j--){
               System.out.print(" ");
           }
        
        //printing nos
        for(int k=1;k<=2*i-1;k++){
            System.out.print(temp);
            if(temp>1&&count==0){
                temp--;
            }
            else{
                temp++;
                count=1;
            }
        }
            System.out.println("");
        } 
        
        
}
}
