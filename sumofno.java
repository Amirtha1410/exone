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
public class sumofno {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a,sum=0;
        System.out.println("SUM OF NUMBERS GREATER 100 AND LESS THAN 200");
      
        for (int i=100;i<200;i++)
        {
         if(i%7==0)
            {
                sum=sum+i;
            }
        }
        
        System.out.println("Sum of given numbers:"+sum);
    }
    
}
