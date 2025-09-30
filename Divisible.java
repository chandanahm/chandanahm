//wjp to check the given number is divisible by 3 or 5 or both or not
 class Divisible
{   
   public static void main(String[] args) 
    {
      int x=3;
     
     if( x%3==0 && x%5==0)
       {
       System.out.println("Divisible by both 3 and 5");
      }

     else if(x%3==0)
      {
        System.out.println("Divisible by 3");
       }
     else if(x%5==0)
      {
       System.out.println("Divisible by 5");
       }
     
     else{
        System.out.println("Not divisible by both;");
     }
 
}
}