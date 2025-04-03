class Demo{
	public static void main(String [] args){
		int arr1[] = {1,2,3,-129,5};
		int arr2[] = {1,2,3,-129,5};
		int var1=100;
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}
		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr2[0]));

		System.out.println(System.identityHashCode(arr1[3]));
		System.out.println(System.identityHashCode(arr2[3]));

		System.out.println(System.identityHashCode(var1));
	}
}