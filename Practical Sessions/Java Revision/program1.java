class ArrayDemo{
	public static void main(String [] args){
		//String arr="C2W";
		String arr=new String("C2W");
		char arr1[]={'C','2','W'};
		System.out.println(arr);
		//System.out.println("Array ="+arr);
		System.out.println(arr1);
		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(arr1));
	}

}