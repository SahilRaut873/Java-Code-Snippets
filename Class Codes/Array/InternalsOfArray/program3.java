class ArrayDemo{
	public static void main(String [] arg){
		float arr1[]= {12f, 13.2f, 14.3f, 15.4f};
		float arr2[] ={12f, 13.2f, 14.3f, 15.4f };

		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr2[0]));
	}
}
