import java.util.Scanner;
public class Product{
int pId;
String pName;
int noOfQuantity;
double price;

   public void displayProductDetails()
   {
	System.out.println("product id : "+this.pId);
	System.out.println("product name : "+this.pName);
	System.out.println("Number of quantity : "+this.noOfQuantity);
	System.out.println("product price : "+this.price);
      }
	{
	this.pId = 234;
	this.pName = "spandu";
	this.noOfQuantity = 1;
	this.price = 235;
	}
public static void main(String[] args){
	Product p1 = new Product();
	Product p2 = new Product();
	p1.price = 267;
	p1.noOfQuantity = 3;
	p2.pName = "mobile";
	p1.displayProductDetails();
	p2.displayProductDetails();
        
        
}
}
