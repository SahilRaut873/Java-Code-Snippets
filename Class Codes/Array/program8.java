import java.util.*;
class ArrayDemo{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		char arr[]=sc.next().toCharArray();

		for(int i=0; i<5; i++){
			System.out.println(arr[i]);
		}
	}
}