class Demo{
	public static void main(String [] args ){
		int var1 =10;
		int var2 =128;
		System.out.println(System.identityHashCode(var1));
		System.out.println(System.identityHashCode(var2));

		System.out.println(System.identityHashCode(var1));
		System.out.println(System.identityHashCode(var2));

		System.out.println(System.identityHashCode(var2));

		int var3=128;

		System.out.println(System.identityHashCode(var3));

	}
}