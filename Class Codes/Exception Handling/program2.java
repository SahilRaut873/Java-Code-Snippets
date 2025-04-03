/*//Array Index Out Of Bound Exception
class ArrayDemo{
	public static void main(String [] args){
		int arr[]=new int[]{10,20,30,40,50};
		for(int i=0; i<=arr.length; i++){
			System.out.println(arr[i]);
		}
	}


//Runtime Exception or Unchecked Exception*/
import java.io.*;
class ArrayDemo{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0; i<=arr.length;i++){
			System.out.println(arr[i]);
		}

	}
}