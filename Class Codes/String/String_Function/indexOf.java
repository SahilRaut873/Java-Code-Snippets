import java.util.*;
class IndexOf{
	static int myIndexOf(String str1, char ch, int x){
		char arr[]=str1.toCharArray();

		for(int i=x; i<arr.length; i++){
			if(arr[i]==ch){
				//System.out.println(+ch "The character is at "+x);
				return i;
			}
		}
		System.out.println("illegal Index");
		return -1;
	}
	public static void main(String [] arhs){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String str=sc.next();

		System.out.println("Which Character To Found in String");
		char ch = sc.next().charAt(0);

		System.out.println("Enter Which index to found");
		int x=sc.nextInt();
		IndexOf obj = new IndexOf();
		int ret=obj.myIndexOf(str,ch,x);
		System.out.println(ret);
	}
}