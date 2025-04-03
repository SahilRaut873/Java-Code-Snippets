import java.util.*;
class StringBufferDemo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		StringBuffer str1 = new StringBuffer();

		System.out.println("Enter String ");
		StringBuffer str2 = new StringBuffer(sc.next());

		System.out.println(str2.capacity());

		System.out.println(str2.capacity());

	}
}