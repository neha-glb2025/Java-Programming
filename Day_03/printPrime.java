// Write a program to Check whether a number is prime. 

import java.util.Scanner;

public class printPrime
{
    public static void main(String[] args)
    {
Scanner sc = new Scanner(System.in);
System.out.println("enter a range");
int num = sc.nextInt();


for(int i = 1; i <= num; i++)
{  
    int c = 0;
    for(int j = 1; j <= i; j++)
    {
if(i % j == 0)
c++;
    }

    if(c == 2)
    System.out.println("" +i); 
}

    }
}