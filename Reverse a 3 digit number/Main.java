import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner i = new Scanner(System.in);
    int num = i.nextInt();
    int a = num%10;
    int c = num/100;
    int b = num/10;
    int d = b%10;
    System.out.print(a);
    System.out.print(d);
    System.out.print(c);
  }
}