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
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
         System.out.println("enter the number");
         int n=sc.nextInt();
         int row=n;
         int col=n;
         int[][] mat=new int[row][col];
         int top=0;
         int down=row-1;
         int left=0;
         int right=col-1;
         int count=1;
         while(top<down &&left<right){
            for(int i=left;i<=right;i++){
                mat[top][i]=count;
                count++;
            } 
            top++;
             for(int i=top;i<=down;i++){
                mat[i][right]=count;
                count++;
            } 
            right--;
             for(int i=right;i>=left;i--){
                mat[down][i]=count;
                count++;
            } 
            down--;
             for(int i=down;i>=top;i--){
                mat[i][left]=count;
                count++;
            } 
            left++;
            
         }
          //print
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
    
}
}