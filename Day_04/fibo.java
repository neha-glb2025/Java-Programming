import java.util.Scanner;

public class fibo
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter limit");  
      int n = sc.nextInt();

      int term1 = 0, term2 = 1;

      System.out.print(term1 + " , ");
      System.out.print(term2);

      for (int i = 3; i <= n; i++) 
      {
         int nexterm = term1 + term2;

         System.out.print(" , " + nexterm); 

         term1 = term2;
         term2 = nexterm;
      }

      

    }
}