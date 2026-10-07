import java.util.Scanner;

public class FindNthFibo
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("enter value of nth position"); 

       int n = sc.nextInt();
       int term1 = 0, term2 = 1, nexterm = term1 + term2;

       if(n == 1)
      { System.out.println(term1);}

       if(n == 2)
       {System.out.println(term2);}

       else
    {
        for (int i = 3; i <= n; i++) 
        {
           nexterm = term1 + term2;
           term1 = term2;
           term2 = nexterm;
        }
        System.out.print(nexterm);
        
    }

} 
}      




    