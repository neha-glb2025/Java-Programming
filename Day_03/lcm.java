// Write a program to Find LCM of two numbers. 

import java.util.Scanner;

public class lcm
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in) ;

       System.out.println("Enter value of a");
       int a = sc.nextInt();

       System.out.println("Enter value of b");
       int b = sc.nextInt();

       int x = a;
       int y = b;
       int rem, lcm;

       while(b > 0)
       {
       rem = a % b;
       a = b;
       b = rem;
       }

       int gcd = a;

       lcm = (x * y) / gcd;

       System.out.println("lcm = " +lcm);

    }
       
}