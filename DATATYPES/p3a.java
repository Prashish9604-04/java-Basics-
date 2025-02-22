class C2W{

	public static void main(String[]args){
	
		int ch = 65; 
		char ch1 = ch;  //error: incompatible types: possible lossy conversion from int to char

		System.out.println(ch);
		System.out.println(ch1);
	}
}
