import java.io.*;
class ArrayDemo{
	public static void main(String ar [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[]=new int[5];
		System.out.println("Enter Array Elements ");
		for(int i=0; i<5; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Printed Array Elements Are ");
		for(int i=0; i<5; i++){
			System.out.println(arr[i]);
		}
	}
}