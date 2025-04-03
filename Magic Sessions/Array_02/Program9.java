import java.io.*;
class Uncommon{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Eneter Array Size ");

		int size=Integer.parseInt(br.readLine());

		int arr1[]=new int[size];

		int arr2[]=new int[size];

		System.out.println("Enter First Array ");
		for(int i=0; i<arr1.length; i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Eneter Second Array ");
		for(int i=0; i<arr2.length; i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("UnCommon Elements Are ");
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr1[i]==arr2[j]){
				}else{
					System.out.println(arr1[i]);
				}
			}
		}

	}
}