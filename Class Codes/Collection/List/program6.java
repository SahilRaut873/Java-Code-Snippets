//ArrayList Using Vector
import java.util.*;
class ArrayListDemo{
	public static void main(String [] args){
		ArrayList al=new ArrayList();
		al.add("Sahil");
		al.add("Raut");
		al.add(21);
		al.add(97.00);

		//System.out.println(al);

		Vector v=new Vector(al);
		v.addElement("Kunal");
		v.addElement("Raut");
		v.addElement(25);
		v.addElement(95.00);

		System.out.println(v);
	}
}