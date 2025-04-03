import java.util.*;
class CursorDemo{
	public static void main(String [] args){
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(20.5);
		al.add(30.5f);
		al.add("C2W");

		System.out.println(al);

		/*for(var x:al){
			System.out.println(x.getClass().getName());
		}*/

		Iterator cursor=al.iterator();
		while(cursor.hasNext()){
			if("C2W".equals(cursor.next()));
			cursor.remove();
		}
		System.out.println(al);
		System.out.println(cursor.getClass().getName());
	}
}