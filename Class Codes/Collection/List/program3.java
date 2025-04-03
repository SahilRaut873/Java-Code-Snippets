import java.util.*;
class LinkdeListDemo{
	public static void main(String [] args){
		LinkedList ll=new LinkedList();
		ll.add(20);
		ll.addFirst(10);
		ll.addLast(30);
		ll.add(40);

		System.out.println(ll);

		System.out.println(ll.getLast());
		System.out.println(ll.getFirst());

		System.out.println(ll.add(50));
		System.out.println(ll);

		//ll.removeLast();
		System.out.println(ll.removeLast());

		ll.removeFirst();
		System.out.println(ll);

		System.out.println(ll.remove(1));

		ll.add(2,20);
		System.out.println(ll);
	}
}