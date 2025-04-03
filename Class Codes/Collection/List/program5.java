//Vector
import java.util.*;
class VectorDemo{
	public static void main(String [] args){
		Vector v=new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		/*v.addElement(50);
		v.addElement(50);
		v.addElement(50);			//Vector Capacity By default 10
		v.addElement(50);			//If Vector Capacity is full 
		v.addElement(50);			//They give new Capacity to multiply previous capacity by 2...
		v.addElement(50);*/

		System.out.println(v);
		System.out.println(v.capacity());

	}
}