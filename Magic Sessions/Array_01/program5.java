import java.io.*;
class OddSum{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enetr Array Size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]%5==0){
				System.out.print(arr[i]" ");
			}
		}
	}
}
