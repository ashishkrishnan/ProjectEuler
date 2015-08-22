package org.askn.SuperProblems;

// MARKED UNDER TEST 
import java.util.Scanner;

 //  This program calculates the number of digits in N!
 //  Based on Dmitry Kamenetsky's Formula 
 /*
  *      [log(2 * pi * N)/2 + N(log N - log e)] / log 10 
  *      
  *      where N > 0 upto infinity 
  * 
  * 
  * 
  */


public class DigitsInFactorial {

	
	public static void main(String[] args) {
	  
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a Number ( N! )= ");
    int number = input.nextInt(); 
    //
   
    double calc1 = Math.log10(2 * Math.PI * number)/2;
    double calc2 = number * (Math.log10(number) - Math.log10(Math.E)) / Math.log10(10);
    long result = Math.round(calc1+calc2+1);
    
    System.out.println("The Number of digits:"+result);
    
    
	}
	
}
