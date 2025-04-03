import java.util.*;
class IteratorDemo{
	public static void main(String [] args){
		ArrayList al=new ArrayList();
		al.add("Kanha");
		al.add("Ashish");
		al.add("Rahul");
		al.add("Badhe");

		System.out.println(al);

		Iterator cursor=al.iterator();
		while(cursor.hasNext()){
			if("Badhe".equals(cursor.next())){
				cursor.remove();
				System.out.println(al);
			}else{
				System.out.println("No Such Element Found");
			}
		}
		System.out.println(al);
	}
}
