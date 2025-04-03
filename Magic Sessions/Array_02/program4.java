import java.io.*;
class OddEven{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size ");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		//int search=Integer.parseInt(br.readLine());
		System.out.println("Enter Array Elements ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
			
	}
	System.out.println("Enetr Element to search ");
	int search=Integer.parseInt(br.readLine());
	for(int i=0; i<size; i++){
		if(arr[i]==search){
			System.out.println("Element found at index: "+i);
		}
	}
	}
}