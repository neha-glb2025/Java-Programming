//Write a program to Find sum of digits of a number.

import java.util.Scanner;

public class digitSum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        int r, dsum = 0;

        while(num > 0)
        {
            r = num % 10;
            dsum+= r;
            num/= 10;
        }

        System.out.println("Sum of digits = " + dsum);
    }
}