import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner i = new Scanner(System.in);
    int n = i.nextInt();
    for(int a=1; a<=n; a++){
    System.out.print(a);
      if(a%3==0){
      System.out.print(",");
      }
    }
  }
}