package org.askdn.euler;

import java.util.Scanner;

public class Euler2_EvenFib {

	public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    int testcases = input.nextInt();
    for(int i=0;i<testcases;i++)
        {
         // Using the SEQUENCE OF FIB 
         long number = input.nextLong();
         long a = 2;
         long b = 0;
         long result = 2;
         long summed = 0;
 
        while (result < number) {
             summed += result;
             result = a + a + a + a + b;
             b = a;
             a = result;
}
        System.out.println(summed);
          
     
    }
    }
}
