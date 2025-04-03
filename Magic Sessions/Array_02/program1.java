import java.io.*;
class SumDemo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter Array Size ");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int sum=0;
		System.out.println("Enter Array Elements ");
		for(int i=0; i<size; i++){
			arr[i]=Integer.parseInt(br.readLine());
			sum=arr[i]+sum;
		}
		System.out.println("Sum of Array Elements is "+sum);
	}
}