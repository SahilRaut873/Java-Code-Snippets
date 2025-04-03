//Stack
import java.util.*;
class StackDemo{
	public static void main(String [] args){
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(500);

		System.out.println(s);		//Insertion Order Prserved 

		System.out.println(s.peek());		//return data

		System.out.println(s.pop());		//return pop data
		System.out.println(s);

		System.out.println(s.search(30));
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());
		//System.out.println(s.pop());
		//System.out.println(s);


		System.out.println(s.empty());
		System.out.println(s);
	}
}