package prcode;

import java.util.Scanner;

public class exception_throw2 {

  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter two numbers");
    a=s.nextInt();
    b=s.nextInt();
    try
    {
      if(b<=0 || b>a)
         throw new ArithmeticException();
      else
        c=a/b;
      System.out.println("Result is "+c);
    }
    catch(ArithmeticException e)
    {
      System.out.println("Divisor should not be less than or equal to zero and should not be greater than dividend");
    }
    s.close();
  }

}