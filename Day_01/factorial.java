// Write a program to Find factorial of a number. 

import java.util.Scanner;

public class factorial
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number");
       int num = sc.nextInt();
       int i, fact = 1;

       for(i = 1; i <= num; i++)
       {
        fact*= i;
       }

       System.out.println("factorial = " + fact);   
    }
}