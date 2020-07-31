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
public class greetmessage {
    public static void main(String[] args){
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter the mark obtained by the student");
          double m=obj.nextDouble();
         System.out.println("Enter the key for greet message");
          int a=obj.nextInt();
          switch(a)
          {
              case 1:
              {
                if (m==10)
                {
                   System.out.println("EXCELLENT");
                break;
                 }
              }
              
              case 2:
              {
                  if(m<=9 || m>=8)
                  {
                      System.out.println("VERY GOOD");
                  break;
                  }
              }
              
              case 3:
              {
                  if(m<=7 || m>=6)
                  {
                      System.out.println("GOOD");
                  break;
                  }
              }
              
              case 4:
              {
                  if(m<=5 || m>=3)
                  {
                    System.out.println("POOR");
                  break;
                  }
              }
              
              case 5:
              {
                  if( m<=2 || m>=0)
                  {
                       System.out.println("VERY POOR");
                  break;
                  }
              }
              default:
              {
                  System.out.println("NOT AVAILABLE");
              }
           
          }
    }
    
}
