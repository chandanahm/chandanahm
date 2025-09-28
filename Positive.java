import java.util.Scanner;
class Positive 
  { 
   public static void main(String[] args)
       {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Start");
        if(n>0)
         {
           System.out.println("Positive");
         }
        else
          {
           System.out.println("Negative");
          }
   }
}
      
