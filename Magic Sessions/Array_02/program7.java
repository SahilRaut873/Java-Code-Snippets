import java.io.*;
class Common{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Eneter Array Size");

		int size=Integer.parseInt(br.readLine());

		int arr1[]=new int[size];

		int arr2[]=new int[size];

		int num;

		System.out.println("Enter First Array ");
		for(int i=0; i<arr1.length; i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Eneter Second Array ");
		for(int i=0; i<arr2.length; i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Common Elements Are ");
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr1[i]==arr2[j]){

				}else{
					num=arr1[i];
				}
			}
		}
		System.out.println(+num);
	}
}