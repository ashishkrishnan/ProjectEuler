package org.askdn.offShoots;

import java.util.Scanner;

public class EulerTest2 {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    
	    final double ROOT5 = 0.447;
	    final double FACTOR = 1.618;

	    Scanner input = new Scanner(System.in);
	    int testcases = input.nextInt();
	    for(int i=0;i<testcases;i++)
	        {
	         int sum = 0;
	         int number = input.nextInt();
	         for(int j=3;j<number;j+=3)
	         {
	           double temp = (ROOT5 * (Math.pow(FACTOR,j)));
	           int fib = (int) Math.round(temp);
	           if(fib < number)
	             {
	                sum+=fib;  
	             }
	             else
	             {
	                break;    
	              }
	           }
	         System.out.println(sum);
	       }
	     
	    }
	}