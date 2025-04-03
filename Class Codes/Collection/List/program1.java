//ArrayList
import java.util.*;
class ArrayListDemo extends ArrayList{
	public static void main(String [] args){
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20.5f);
		al.add("Shashi");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);
		System.out.println(al.size());

		System.out.println(al.contains("Shashi"));		//True
		System.out.println(al.contains(30));			//False

		System.out.println(al.indexOf("Shashi"));		//2

		System.out.println(al.lastIndexOf(20.5f));

		System.out.println(al.get(3));

		System.out.println(al.set(4,"C2W"));
		System.out.println(al);

		al.add(2,"Incubator");
		System.out.println(al);

		System.out.println(al.remove(4));
		System.out.println(al);

		ArrayList al2=new ArrayList();
		al2.add("Salman");
		al2.add("Sharukh");
		al2.add("Amir");

		al.addAll(al2);
		System.out.println(al);

		//al.removeRange(3,5);
		//System.out.println(al);

		Object arr[]=al.toArray();
		System.out.println(arr);
		for(Object data : arr){
			System.out.print(data+" ");
		}


	}
}