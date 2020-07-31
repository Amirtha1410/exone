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
public class swaping {
      public static void main(String[] args)
      {
          Scanner obj=new Scanner(System.in);
          int temp;
          System.out.println("Enter two numbers:");
          int a=obj.nextInt();
          int b=obj.nextInt();
          System.out.println("Before swaping of given variables:");
          System.out.println("\nA="+a+"\nB="+b);
          System.out.println("After swaping of given variables:");
          temp=a;
          a=b;
          b=temp;
          System.out.println("\nA="+a+"\nB="+b);
          
      }       
             
    
}
