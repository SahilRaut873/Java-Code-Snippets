import java.util.*;
class ArrayInput{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Array Size");      //Take array size from user 
													 //All inputs from user
		int size = sc.nextInt();
		int arr[]=new int[size];

		int sum=0;
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements Are ");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
			sum=arr[i]+sum;
		}
		System.out.println("Sum of Array Elements is " + sum);
	}
}
