import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      for(int a=1; a<=n; a++){
      if(n%a==0){
      System.out.println(a);
      }
      }
	    
	}
}