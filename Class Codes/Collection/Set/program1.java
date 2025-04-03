import java.util.*;
class HashSetDemo{
	public static void main(String [] args){
		HashSet hs=new HashSet();
		hs.add("Kanha");
		hs.add("Rahul");
		hs.add("Badhe");
		System.out.println(hs.add("Kanha"));
		hs.add("Rahul");
		hs.add("Ashish");		
		//Duplicate data not allowed Here If you give duplicate data Then its update Previous data
		System.out.println(hs);
	}
}