import java.io.*;
class OddEven{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size ");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int min=arr[0];
		for(int i=0; i<size; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Min element= "+min);
	}
}
			
