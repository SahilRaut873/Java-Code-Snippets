//ListIterator
import java.util.*;
class ListIteratorDemo{
	public static void main(String [] args){
		ArrayList al=new ArrayList();
		al.add("Kanha");
		al.add("Ashish");
		al.add("Rahul");
		al.add("Badhe");

		System.out.println(al);


		ListIterator litr=al.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		System.out.println(litr.previous());
		System.out.println(litr.next());
		System.out.println(litr.previousIndex());
		//System.out.println(litr.remove());			//Error
		System.out.println(litr);
		System.out.println(litr.nextIndex());
		System.out.println(litr.next());    		 //Exception


	}
}