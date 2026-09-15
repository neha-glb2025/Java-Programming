//Write a program to Check whether a number is palindrome or not.

import java.util.Scanner;

public class checkPalindrome
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);

      System.out.println("enter a number");
      int num = sc.nextInt();
      int r, palind = 0, n;

      n = num;
      while(num > 0)
      {
        r = num % 10;
        palind = palind * 10 + r;
        num/= 10;
      }

      if(palind == n)
      System.out.println("Palindrome number");

      else
      System.out.println("Not Palindrome number");
       
    }
}