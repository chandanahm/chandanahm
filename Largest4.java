//wjp to find largest among 3 numbers by using if else
class Largest4
{   
   public static void main(String[] args) 
    {
      int a=5;
      int b=20;
      int c=10;
      if(a>b)
      {
       
         if(a>c)
          {
            System.out.println("largest number"+a);
          }
        else
          {
            System.out.println("largest number"+c);
 
          }
       }
     else
       {
        if(b>c)
         {
     
            System.out.println("largest number"+b);
         }

       else
        {
        System.out.println("Largest number"+c);
        }
      }

    }
}