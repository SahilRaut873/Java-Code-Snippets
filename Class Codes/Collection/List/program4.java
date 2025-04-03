//Cursor
import java.util.*;
class IteratorDemo{
	public static void main(String [] args){
		ArrayList al=new ArrayList();
		al.add("Rutik");
		al.add("Bhushan");
		al.add("Abhishek");

		Iterator itr=al.iterator();
		while(itr.hasNext()){
			if("Sahil".equals(itr.next()));
			itr.remove();

			System.out.print(itr.next());
		}
		System.out.print(al);
	}
}