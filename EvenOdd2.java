//wjp to print evenodd without using arithmetic operation

class EvenOdd2
{   
   public static void main(String[] args) 
    {
      int n=8;
      if((n&1) == 0)
      {
        System.out.println(n+" even");
       }
      else
      {
       System.out.println(n+" odd");
       }
}
}