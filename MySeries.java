//ratetype.com


import java.util.Scanner;

public class MySeries {
	public static void printMySeries(int n) {
		int a = 1;
		while(a <= n) {
		 System.out.print(a+" ");
                  if(a%2==0){
                      a=(2*a+1);
                     
                    }else {
                       a=(2*a);
                      }
		}
	}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// print something to assist user to give input
                System.out.println("Enter a number:");
		int n = sc.nextInt();
		printMySeries(n);
		sc.close();
	}
}
              
     