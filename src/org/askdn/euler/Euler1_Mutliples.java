package org.askdn.euler;


import java.util.*;

public class Euler1_Mutliples {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner input = new Scanner(System.in);
    int testcases = input.nextInt();
    for(int i=0;i<testcases;i++)
    {
        long N = input.nextInt();
        N--;
        long sum =0;
        long num = 0;
        //for numbers that is divisble by 3
        if(N>=3)
        {
         num = N/3;
         sum+=num * (3 + num*3)/2;
        }
        if(N>=5)
        {
         num = N/5;
         sum+=num * (5 + num*5)/2;
        }
         if(N>=15)
        {
         num = N/15;
         sum-=num * (15 + num*15)/2;
        }
       
       System.out.println(sum);
    }
  }
}