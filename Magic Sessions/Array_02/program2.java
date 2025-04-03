import java.io.*;
class OddEven{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size ");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int oddCount=0;
		int evenCount=0;
		System.out.println("Enter Array Elements ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				evenCount++;
			}else{
				oddCount++;
			}
		}
		System.out.println("Number of Even Element: "+evenCount);
		System.out.println("Number of Odd Element: "+oddCount);

	}
}