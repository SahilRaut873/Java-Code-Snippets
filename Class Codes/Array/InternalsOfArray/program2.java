class ArrayDemo{
	public static void main(String [] args){
		char arr1[] = {'Z','B','C','D'};
		char arr2[] = {'A','B','C','D'};

		System.out.println(System.identityHashCode(arr1[0]));

		System.out.println(System.identityHashCode(arr2[0]));
	}
}