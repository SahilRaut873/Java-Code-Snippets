class StringDemo{
	public static void main(String [] args){
		String str1 = "Sahil ";
		String str2 = "Raut";

		System.out.println(str1 + str2);

		String str3 = "Sahil Raut";
		String str4 = str1+str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}