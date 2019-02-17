import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      int sum=0;
      for(int count=1; count<=n; count++){
       sum = sum+count;
        
      }
	    System.out.println(sum); 
	}
}