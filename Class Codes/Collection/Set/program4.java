//LinkedHashMap
import java.util.*;
class HashDemo{
	public static void main(String [] args){

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(70);
		al.add(70);				//Duplicate Data Yet nay

		System.out.println(al);

		LinkedHashSet ls=new LinkedHashSet();
		ls.add("Digvijay");
		ls.add("Abhya");
		ls.add("Kunal");
		ls.add("Saurav");
		ls.add("Soham");
		System.out.println(ls);			//Insertion Order Preserve kart

		System.out.println(ls.size());

		System.out.println(ls.hashCode());
		System.out.println(ls.addAll(al));

		System.out.println(ls.size());

		System.out.println(ls);

		//System.out.println(ls.removeAll(al));   		//je collection deil te remove hot
		//System.out.println(ls);

		System.out.println(ls.retainAll(al));		//je collection deil tevdh ch det
		System.out.println(al);
		System.out.println(ls);

		System.out.println(ls.size());

		al.clear();						//jya collection var clear karal tas clear hot
		System.out.println(ls);
		System.out.println(al);

		/*Iterator itr=ls.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());

		System.out.println(itr.hasNext());

		System.out.println(itr.hashCode());*/
	}
}