// Write a program to Calculate sum of first N natural numbers.

import java.util.Scanner;

public class NaturalNoSum
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of N");
    int N = sc.nextInt();

    int i, sum = 0; 

    for(i = 1; i <= N; i++)
    {
        sum+= i;
    }

    System.out.println("Sum = " + sum);
 }
}