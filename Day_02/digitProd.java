//Write a program to Find product of digits. 

import java.util.Scanner;

public class digitProd
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        int r, dprod = 1;

        while(num > 0)
        {
            r = num % 10;
            dprod*= r;
            num/= 10;
        }

        System.out.println("Product of digits = " + dprod);
    }
}