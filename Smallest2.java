//wjp to find smallest among 3 numbers by using if else
//using simple if
//wjp to check the given character is upper casre or lower case
//wjp to check  the given charracter is upper case, lower case, digit or special character
//wjp to check the year is leap year or not
class Smallest2{
    public static void main(String[] args) {
        int a = 85, b = 78, c = 56;

       
        int small = a;
        if (small>b) 
         {
          small = b;
         }
        if (small>c)
         {
          small = c;
         }
        System.out.println(small);   
      
    }
}
