import java.util.Scanner;
class Main { 
	public static void main(String[] args){
      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      int num=0;
      for(int row=1; row<=n; row++){
        for(int col=1; col<=row; col++){
          num=num+1;
        if(num%2==0){
          System.out.print("#");
        }else{
        System.out.print("*");
        }
      }System.out.print("\n");
      }
    }
}