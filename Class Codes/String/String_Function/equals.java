import java.util.*;
class EqualsDemo{
	boolean myEqual(String str1,String str2){
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		int flag =0;
		if(arr1.length==arr2.length){
			for(int i=0; i<arr1.length; i++){
				if(arr1[i]==arr2[i]){
					flag =0;
				}else{
					flag=1;
				}
			}
			if(flag==0)
				return true;
			else 
				return false;
		}
		else 
			return false;
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str1=sc.next();

		System.out.println("Enter 2nd String");
		String str2=sc.next();

		EqualsDemo obj = new EqualsDemo();
		boolean ret=obj.myEqual(str1,str2);

		System.out.println(ret);
	}
}