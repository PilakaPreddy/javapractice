//using throw
package prcode;

import java.util.Scanner;

public class using_throw {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a;
    System.out.println("Enter a number");
    a=sc.nextInt();
    try
    {
    if(a<0)
      throw new ArithmeticException("It is Negative");
    else
      System.out.println("You entered "+a);
    }
    catch(ArithmeticException e)
    {
      System.out.println("You entered a negative number");
    }
    
    System.out.println("This is the use of throw");
    sc.close();
      
  }

}