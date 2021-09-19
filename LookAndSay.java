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
public class LookAndSay {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the n value");
         int n=sc.nextInt();
         System.out.println("1");
          String temp="1";
           int i=1; //1st row
           while(i<n){
         String newstr="";
         char a=temp.charAt(0);
         int count=1;
          for(int j=1;j<temp.length();j++){
             if(temp.charAt(j)!=temp.charAt(j-1)){
             System.out.print(count+""+a);            
             newstr=newstr+""+count+""+a;
             a=temp.charAt(j);
             count=1;
              }
             else{
                     count++;
                     }         
         }
         System.out.println(count+""+a);
         newstr=newstr+""+count+""+a;
         temp=newstr;
         i++;
         
    }
    
}
}
