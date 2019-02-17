import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      int num= 1;
      for(int row=1; row<=n; row++){
        for(int col=1; col<=row; col++){
          System.out.print(num);
        }System.out.print("\n");
        num= num+1;
      }
	    
	}
}