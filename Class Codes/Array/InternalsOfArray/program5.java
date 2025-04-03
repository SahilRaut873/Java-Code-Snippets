class Demo{
	public static void main(String [] args){
		int var1 = 200;
		int var2 = 200;
		System.out.println(System.identityHashCode(var1));
		System.out.println(System.identityHashCode(var2));

	}
}