class StringDemo{
	public static void main(String[] args){
		String str1 = "Shashi";
		String str2 = "Bgal";

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		str1.concat(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}
}

//String jar concat keli tar navin object banto but te thvayela Bhand lagel yek.