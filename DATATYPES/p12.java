class Float{

	public static void main(String[]args){
	
		double num1 = 90.89D;
		System.out.println(num1);

		float num2 = num1;   //error: incompatible types: possible lossy conversion from double to float
		System.out.println(num2);
	}
}
