/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram.EXone;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class armstrongno {
    public static void main(String[] args)
    {
     Scanner obj=new Scanner(System.in);
     int n,s=0,r;
     System.out.println("Enter a number");
     int a=obj.nextInt();
     n=a;
     while(a!=0)
     {
         r=a%10;
         s=s+(r*r*r);
         a=a/10;
     }
     if(s==n)
     {
        System.out.println("The number is ARMSTRONG NUMBER");
     }
     else
     {
          System.out.println("The number is not ARMSTRONG NUMBER");
     }
    }
    
}
