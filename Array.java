class Array 
{
	public static void main(String[] args)
        {
		//int[] arr={10, 12, 7, 10,15};

		//for(int i=0; i< arr.length; i++){ //for loop
                  // System.out.println(arr[i]);}
		
		
		//for(int a : arr){ // for each
			//System.out.println(a);}
      


		int[] intArr = new int[5];// int array
		System.out.println("Display int value");
		for(int e : intArr){
			System.out.println(e);}
  
		boolean[] boolArr = new boolean[5];// bool array
		System.out.println("Display boolean value");
		for(boolean e : boolArr){
		System.out.println(e);}
   
		float[] floatArr = new float[5];//float array
		System.out.println("Display float value");
                for(float e : floatArr){
                System.out.println(e);}
		
		char[] charArr = new char[5];//char array
		System.out.println("Display char value");
		for(char e : charArr){
                System.out.println("*"+e);}

		String[] strArr = new String[5]; //string array
		System.out.println("Display string value");
		for(String e : strArr ){
 		System.out.println(e);}
		
		
		

        }
}

