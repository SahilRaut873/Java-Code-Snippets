import java.util.*;
class CharDemo{
	char myCharAt(String str,int x){
		char arr[]=str.toCharArray();
		return arr[x];
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String str=sc.next();

		CharDemo obj= new CharDemo();
		System.out.println("Enter Character Position (Index)");
		int x = sc.nextInt();

		char ch=obj.myCharAt(str,x);

		System.out.println("Indexf Of Character is "+ch);
	}
}