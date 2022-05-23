package prcode;
import java.util.Scanner;
class Multi{
  void table(int n)
  {
    int i,m;
    for(i=1;i<=10;i++)
    {
      m=n*i;
      System.out.println(n+"x"+i+"="+m);
    }
  }
  
}

public class printingtables {

  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("Enter number for Ravi ");
    n=s.nextInt();
    Multi p=new Multi();
    p.table(n);
    s.close();
    
    

  }

}