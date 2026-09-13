// Write a program to Count digits in a number.  
 
 import java.util.Scanner;

 public class digitCount
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();
        int count = 0;

        while(num > 0)
        {
         num = num / 10;
         count++;
        }

        System.out.println("No. of digits = " + count);
    }
 }
