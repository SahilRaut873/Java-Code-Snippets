//Find Minimum and maximum elements in array

class ArrayDemo{
	public static void main(String [] args){
		int arr[]=new int[]{3,2,1,56,10000,67};
		int n=6;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.println(max);
		for(int i=0; i<n; i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}