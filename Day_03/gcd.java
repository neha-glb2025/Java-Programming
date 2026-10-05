// Write a program to Find GCD of two numbers. 

import java.util.Scanner;
public class gcd
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter value of a");
        int a = sc.nextInt();

        System.out.println("enter value of b");
        int b = sc.nextInt();

        int rem;

        while(b > 0)
        {
        rem = a % b;
        a = b;
        b = rem;
        }

        int gcd = a;

        System.out.println("gcd = " +gcd);


    }
}
        
        
        