//wjp to find a largest among 3 numbers by using else if ladder
class Largest3
{   
   public static void main(String[] args) 
    {
      int a=5;
      int b=8;
      int c=10;
      if(a>b && a>c)
      {
        System.out.println("largest number"+a);
       }
     else if(b>c)
      {
       System.out.println("Largest number"+b);
       }
     else
    {
     System.out.println("Largest number"+c);

    }
    

 
}
}