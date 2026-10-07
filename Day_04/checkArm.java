import java.util.Scanner;

public class checkArm
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a no."); 
       int n = sc.nextInt();
       int r, arm = 0, c = 0;


       int num = n;
       while(n > 0)
       {
       n = n / 10;
       c++;
       }

       int num1 = num;
       while(num > 0)
       {
        r = num % 10;
        arm = arm + (int)Math.pow( r, c);
        num = num / 10;
       }

       if(arm == num1)
       System.out.println("armstrong no.");

       else
       System.out.println("Not armstrong no.");


    }
}