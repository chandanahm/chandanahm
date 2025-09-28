import java.util.Scanner;

public class Pattern {
	public static void printPattern(int n) {
         for(int i=1; i<=5; i++){
               for(int j=1; j<=5; j++){
                  if(j<=i){
                       System.out.print(" ");
                     }else{
                        System.out.print(" ");
                          } 
                    } 
                 }
		
		}
	}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.println("Print pattern");
		int n = sc.nextInt();
		printMySeries(n);
		sc.close();
	}
}