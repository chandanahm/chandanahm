class LaptopConstru
{
String brand;
String color;
int price;

	LaptopConstru(String brand, int price)
	{
         	this.brand=brand;
		this.price=price;

 
	}
	LaptopConstru(String color)
	{
         	this.color=color;
	}
	LaptopConstru(int price)
	{
         	this.price=price;
	}

         
	public static void main(String[] args)
	{
	LaptopConstru l1 = new LaptopConstru("lenove", 2000);
	LaptopConstru l2 = new LaptopConstru("White");
	LaptopConstru l3 = new LaptopConstru(2000);

	System.out.println(l1.brand);
	System.out.println(l1.price);
        System.out.println(l2.color);
        System.out.println(l3.price);


	}
}