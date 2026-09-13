// Write a program to Print multiplication table of a given number.

import java.util.Scanner;

public class multipTable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int i;

        for(i = 1; i <= 10; i++)
        {
System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}