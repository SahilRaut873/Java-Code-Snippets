//Largest Element in Array

class ArrayDemo{
	public static void main(String [] args){
		int arr[]=new int[]{1,8,7,56,90};
		int n=5;
		int large=Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			if(arr[i]>large)
			large=arr[i];
		}
		System.out.println(large);
	}
}