import java.util.*;
class Demo{
	public static void main(String [] args){
		int arr[]=new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Eneter Array Elements");            //Using Scanner Class
		for(int i=0; i<5; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Printed array elements are ");
		for(int i=0; i<5; i++){
			System.out.println(arr[i]);
		}
	}
}