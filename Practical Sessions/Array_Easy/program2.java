import java.util.*;
class ArrayDemo{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Eneter Array Size");
		int num=sc.nextInt();

		System.out.println("Eneter Array Elements");
		int arr[]=new int[num];
		for(int i=0; i<num; i++){
			arr[i]=sc.nextInt();
		}
		int val=3;
		for(int i=0; i<num; i++){
			if(arr[i]==val){
				System.out.println(i);
			}
		}
	}
}