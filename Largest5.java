//3 largest by usinf simple if
class Largest5{
    public static void main(String[] args) {
        int a = 85, b = 78, c = 56;

       
        int largest = a;
        if (largest<b) 
         {
          largest = b;
         }
        if (largest<c)
         {
          largest = c;
         }
        System.out.println(largest);   
      
    }
}
