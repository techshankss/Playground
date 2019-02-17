import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner i = new Scanner(System.in);
      int num = i.nextInt();
      int a = num/100;
      int b = num%10;
       int sum = a+b;
      System.out.println(sum);
	}
}