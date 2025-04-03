import java.util.*;
class concatDemo{
	void myconcat(String str1, String str2){
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		int size=arr1.length+arr2.length;

		char arr3[]=new char[size];
		for(int i=0; i<arr1.length; i++){
			arr3[i]=arr1[i];
		}
		for(int i=0,j=arr1.length; j<size; i++,j++){
			arr3[j]=arr2[i];
		}
		for(char ch : arr3){
			System.out.print(ch);
		}
		System.out.println();

	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st String");
		String str1=sc.next();

		System.out.println("Enter 2nd String");
		String str2=sc.next();

		concatDemo obj = new concatDemo();
		obj.myconcat(str1,str2);
	}
}