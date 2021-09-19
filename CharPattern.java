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
public class CharPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        System.out.println("Enter the array of characters");
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        
        int k=n-1;
        int r=0;
        int mid=n/2;
        for(int i=0;i<mid;i++){
            for(int j=1;j<=2;j++){
                if(r<n&&k<n){
                System.out.print(arr[r]+" "+arr[k]);
                k--;
                r++;
                break;
                }
               
               
               
            }
            System.out.println("");
        }
        //second part
        System.out.print(arr[mid]);
        System.out.println("");
        int s=mid-1;
        int t=mid+1;
        for(int i=1;i<=mid;i++){
            
          
            for(int j=1;j<=2;j++){
                if(s>=0&t<n){
                System.out.print(arr[s]+" "+arr[t]);
                s--;
                t++;
                break;
                }
                
            }
             
               
               
            
            System.out.println(""); 
        }
        
    }
    
}
