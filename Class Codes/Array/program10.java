import java.io.*;
class ArrayDemo{
	public static void main(String [] arges)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Eneter Array Size ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Eneter Array Elements ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Array Elements Are");
		int count1=0;
		int count2=0;
		int stored;
		for(int i=0; i<size; i++){
			if(arr[i]%2==0){
                stored=arr[i];
				//System.out.print("Even no in Array is "+arr[i]);
				count1++;
			}else{
				System.out.print("Odd no in  Array is "+arr[i]);
				count2++;
			}
		}
		System.out.println(stored);
		System.out.println("Even no count in Array is = "+count1);
		System.out.println("Odd no count in Array is = "+count2);
	}
}