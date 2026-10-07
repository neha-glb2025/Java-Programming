import java.util.Scanner;

public class printArm
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);

      System.out.println("enter a limit");
      int n = sc.nextInt();
      

for (int i = 1; i <= n; i++) 
{
      int num = i, num1= i, c = 0;
      while(num > 0)
      {
        num/= 10;
        c++;
      }

       int num2 = num1; 
       int r, arm = 0;
      while(num1 > 0)
      {
        r = num1 % 10;
        arm = arm + (int)Math.pow(r, c);
        num1/= 10;
      } 

      if(arm == num2)
      System.out.println(arm);
}




    }
}