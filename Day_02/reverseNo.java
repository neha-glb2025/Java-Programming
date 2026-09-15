//Write a program to Reverse a number. 

import java.util.Scanner;

public class reverseNo
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number");
       int num = sc.nextInt();

       int r, rev = 0;

       while(num > 0)
       {
        r = num % 10;
        rev = rev * 10 + r;
        num/= 10;
       }

       System.out.println("Reverse of no. = " + rev);
    }
}