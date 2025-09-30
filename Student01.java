class Student01
{
	public static void main(String[] args)
	{
	  	Student02[] students=new Student02[5];
	  	students[0] =new Student02(1, "Santu");
	  	students[1] =new Student02(10, "Anandh");
	  	students[2] =new Student02(20, "Ramya");
	  	students[3] =new Student02(40, "Ganesh");
	  	students[4] =new Student02(24, "Reshma");
		
		for(Student02 e: students){//for each
                        
			System.out.println("id: "+e.id+" name: "+ e.name);}
		

		for(int i=0; i < students.length; i++){//for loop
			Student02 s=students[i];
			System.out.println("id: "+s.id+" name: "+ s.name);
			}

}
}