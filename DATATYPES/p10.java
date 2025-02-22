class Integer{

	public static void main(String[]args){
	
		int numInt = 'a';
		float numFloat = numInt;

		System.out.println(numFloat);

		numFloat = 20.005;    //error: incompatible types: possible lossy conversion from double to float

		System.out.println(numFloat);
	}
}
