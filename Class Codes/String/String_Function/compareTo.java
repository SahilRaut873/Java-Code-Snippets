import java.util.*;
class CompareToDemo{
	int mycompareTo(String str1, String str2){
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		if(arr1.length==arr2.length){
			for(int i=0; i<arr1.length;i++){
				if(arr1[i]!=arr2[i]){
					System.out.println("Strings Are Equal But diff letter");
					return arr1[i]-arr2[i];
					//break;
				}
			}
		}else{
			System.out.println("String are not Equal");
			return arr1.length-arr2.length;
		}
		return 0;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st String");
		String str1=sc.next();

		System.out.println("Enter 2snd String");
		String str2=sc.next();

		CompareToDemo obj=new CompareToDemo();
		int diff=obj.mycompareTo(str1,str2);
		if(diff==0){
			System.out.println("Both String are equal "+diff);
		}else{
			System.out.println("String Diff is "+diff);
		}
	}
}