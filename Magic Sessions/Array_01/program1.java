import java.io.*;
class OddSum{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enetr Array Size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		int sum=0;
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2!=0){
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of Odd Element is "+sum);
	}
}