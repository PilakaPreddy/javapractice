//program using command line arguments  - run at command prompt
package prcode;

public class cmdline {

  public static void main(String[] args) {
    int i;
    for(i=0;i<args.length;i++)
      System.out.println(args[i]);
  }
}