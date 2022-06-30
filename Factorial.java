import java.util.Scanner;
class Factorial
{
  public static void main(String args[])
  {
    int n, c, f = 1;
	System.out.println("Enter the number");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    if (n < 0)
      System.out.println("Number is negative.");
    else
    {
      for (c = 1; c <= n; c++)
        f = f*c;
      System.out.println("Factorial of "+n+" is = "+f);
    }
  }
}