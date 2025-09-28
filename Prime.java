import java.util.Scanner;
public class Prime{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check prime");
    int num = sc.nextInt();
    boolean isPrime = true;
    for(int i=2; i<num; i++)
    {
      if(num%i == 0)
        {
          isPrime = false;
           break;
         }
     }
      if(isPrime)
      {
        System.out.println("Given number is Prime");
      } else
         {
         System.out.println("Given number not is Prime");
         }
      


    sc.close();
}
}