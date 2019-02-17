import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner i = new Scanner(System.in);
      int a = i.nextInt();
      int m= 1;
      for(int n=1; n<=a; n++)
        m = m*n;
        System.out.println(m);
        
	}
}