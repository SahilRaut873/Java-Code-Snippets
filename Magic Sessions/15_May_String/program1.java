import java.util.*;
class PailndromeDemo{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\tEnter String ");
		String str1=sc.next();
		String rev="";

		for(int i=str1.length()-1;i>=0;i--){
			rev=rev+str1.charAt(i);

		}
		System.out.println(rev);
		if(str1.equals(rev)){
			System.out.println("String is palindrome");
		}else{
			System.out.println("string is not palindrome");
		}

	}
}