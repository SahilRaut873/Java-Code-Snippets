class StringDemo{
	public static void main(String [] args){
		String str1 = "Shashi ";
		String str2 = "Bagal";

		String str3 = str1+str2;
		String str4 = str1.concat(str2);  // 2 navin Object bantat.

		System.out.println(str3);
		System.out.println(str4);

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}