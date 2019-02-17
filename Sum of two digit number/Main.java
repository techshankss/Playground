import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner i = new Scanner(System.in);
      int num = i.nextInt();
      int a = num/10;
      int b = num%10;
      int c = a+b;
      System.out.println(c);
	}
}