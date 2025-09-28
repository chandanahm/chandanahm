import java.util.Scanner;
public class Student{
String name;
int id;
long mobil;
public static void main(String[] args){
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();

	
	s1.name="chandu";
	s1.id=100;
	s1.mobil=6547382954L;

	s2.name="chandu1";
	s2.id=1001;
	s2.mobil=7547382954L;

	s3.name="chandu2";
	s3.id=1002;
	s3.mobil=8547382954L;
  	
	s1.displayDetails();
	s2.displayDetails();
	s3.displayDetails();
    
	}

public void displayDetails(){
	System.out.println("student details");
	System.out.println(this.name);
	System.out.println(this.id);
	System.out.println(this.mobil);

}
}



