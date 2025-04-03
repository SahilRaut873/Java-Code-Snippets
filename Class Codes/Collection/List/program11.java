//Enumeration
import java.util.*;
class ListIteratorDemo{
	public static void main(String [] args){
		Vector al=new Vector();
		al.add("Kanha");
		al.add("Ashish");
		al.add("Rahul");
		al.add("Badhe");
		al.add("Ashish");
		al.add("Kanha");

		System.out.println(al);
		Enumeration cursor=al.elements();
		System.out.println(cursor.getClass().getName());
		/*while(cursor.hasMoreElements()){
			System.out.println(cursor.nextElement());
		}*/
		System.out.println(cursor.nextElement());
		System.out.println(cursor.nextElement());
		System.out.println(cursor.nextElement());
		System.out.println(cursor.nextElement());
		//System.out.println(cursor.nextElement());   //Exception

	}
}