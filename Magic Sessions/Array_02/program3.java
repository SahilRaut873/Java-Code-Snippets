import java.io.*;
class OddEven{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size ");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int oddSum=0;
		int evenSum=0;
		System.out.println("Enter Array Elements ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				evenSum=evenSum+arr[i];
			}else{
				oddSum=oddSum+arr[i];
			}
		}
		System.out.println("Even Numbers Sum: "+evenSum);
		System.out.println("Odd Numbers Sum: "+oddSum);

	}
}