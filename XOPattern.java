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
public class XOPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row=sc.nextInt();
        System.out.println("enter the number of column");
        int col=sc.nextInt();
        char[][] mat=new char[row][col];
        int top=0;
        int down=row-1;
        int left=0;
        int right=col-1;
        char c=' ';
        while(true){
            if(top%2==0)
               c='X';
            else
                c='O';
            
            //print first row
            for(int i=left;i<=right;i++){
                mat[top][i]=c;   
            }
            top++;
            if(top>down||left>right){
                break;
            }
            //print last column
            for(int i=top;i<=down;i++){
                mat[i][right]=c;   
            }
            right--;
            if(top>down||left>right){
                break;
            }
            //print last row
            for(int i=right;i>=left;i--){
                mat[down][i]=c;   
            }
            down--;
            if(top>down||left>right){
                break;
            }
            //print first column
            for(int i=down;i>=top;i--){
                mat[i][left]=c;   
            }
            left++;
            if(top>down||left>right){
                break;
            }
           
            
            
        }
         //print
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println("");
            }
        
    }
    
}
